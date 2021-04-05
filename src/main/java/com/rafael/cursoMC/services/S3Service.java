package com.rafael.cursoMC.services;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.rafael.cursoMC.services.exceptions.FileException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

@Service
public class S3Service {

    private Logger LOG = LoggerFactory.getLogger(S3Service.class);

    @Autowired
    private AmazonS3 amazonS3;

    @Value("${s3.bucket}")
    private String bucketName;

    public URI uploadFile(MultipartFile multipartFile) {

        try {

            String fileName = multipartFile.getOriginalFilename();
            InputStream inputStream = null;
            inputStream = multipartFile.getInputStream();

            String contentType = multipartFile.getContentType();
            return uploadFile(inputStream, fileName, contentType);

        } catch (IOException e) {
            throw new FileException("Erro de IO: " + e.getMessage());
        }

    }

    public URI uploadFile(InputStream inputStream, String fileName, String contentType) {

        try {

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentType(contentType);

            LOG.info("Iniciando Upload");
            amazonS3.putObject(bucketName, fileName, inputStream, metadata);
            LOG.info("Upload Finalizado");

            return amazonS3.getUrl(bucketName, fileName).toURI();

        } catch (URISyntaxException e) {
            throw new FileException("Erro em converter URL em URI");
        }
    }
}

