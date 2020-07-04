package com.exercio.exercicio_3.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="sobrenome")
    private String sobrenome;

    @Column(name="endereco")
    private String endereco;

    @Column(name="id_cidade")
    private int cidade_id;

    @Column(name="data_nascimento")
    private String data_nascimento;

    @Column(name="limite_credito")
    private double limite_credito;

    @OneToMany
    @JoinColumn(name="id_cliente")
    private List<Telefone> telefones;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCidade_id() {
        return cidade_id;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade_id(int cidade_id) {
        this.cidade_id = cidade_id;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
