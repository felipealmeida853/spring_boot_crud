package com.exercio.exercicio_3.repository;

import com.exercio.exercicio_3.model.Cidade;
import com.exercio.exercicio_3.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    List<Cidade> findByEstado(String estado);
}
