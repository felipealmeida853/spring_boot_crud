package com.exercio.exercicio_3.model;

import javax.persistence.*;

@Entity
@Table(name="cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_cidade")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="estado")
    private String estado;

    public Long getId() {
        return id;
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
