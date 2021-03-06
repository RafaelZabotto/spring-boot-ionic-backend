package com.rafael.cursoMC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rafael.cursoMC.dominio.Cidade;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    @Transactional(readOnly=true)
    @Query("SELECT obj FROM Cidade obj WHERE obj.estado.id = :estadoID ORDER BY obj.nome")
    public List<Cidade> findCidades(@Param("estadoID") Integer estado_id);

}


