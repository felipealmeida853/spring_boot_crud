package com.exercio.exercicio_3.controller.dto;

import com.exercio.exercicio_3.model.Cidade;
import com.exercio.exercicio_3.model.Cliente;

public class CidadeRs {

    private Long id;
    private String nome;
    private String estado;

    public static CidadeRs converter(Cidade c) {
        CidadeRs cidade = new CidadeRs();
        cidade.setId(c.getId());
        cidade.setNome(c.getNome());
        cidade.setEstado(c.getEstado());
        return cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
