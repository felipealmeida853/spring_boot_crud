package com.exercio.exercicio_3.controller.dto;

import com.exercio.exercicio_3.model.Telefone;

import java.util.ArrayList;
import java.util.List;

public class ClienteRq {

    private String nome;
    private String sobrenome;
    private String endereco;
    private int cidade_id;
    private String data_nascimento;
    private double limite_credito;
    private ArrayList<String> telefones;

    public ArrayList<String> getTelefones() {
        return telefones;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
