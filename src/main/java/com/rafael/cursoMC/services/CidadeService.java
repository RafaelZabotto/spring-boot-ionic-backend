package com.rafael.cursoMC.services;

import com.rafael.cursoMC.dominio.Cidade;
import com.rafael.cursoMC.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> findByEstado(Integer estadoID) {
        return cidadeRepository.findCidades(estadoID);
    }
}
