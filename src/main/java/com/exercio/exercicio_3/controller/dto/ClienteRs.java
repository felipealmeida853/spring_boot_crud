package com.exercio.exercicio_3.controller.dto;

import com.exercio.exercicio_3.model.Cliente;
import com.exercio.exercicio_3.model.Telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ClienteRs {

    private Long id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private int cidade_id;
    private String data_nascimento;
    private double limite_credito;
    private ArrayList<String> telefones;


    public static ClienteRs converter(Cliente p) {
        ClienteRs cliente = new ClienteRs();
        cliente.setId(p.getId());
        cliente.setNome(p.getNome());
        cliente.setSobrenome(p.getSobrenome());
        cliente.setEndereco(p.getEndereco());
        cliente.setCidade_id(p.getCidade_id());
        cliente.setData_nascimento(p.getData_nascimento());
        cliente.setLimite_credito(p.getLimite_credito());
        cliente.setTelefones(p.getTelefones());
        return cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(int cidade_id) {
        this.cidade_id = cidade_id;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public ArrayList<String> getTelefones() {
        return this.telefones;
    }

    public void setTelefones(List<Telefone> t) {
        ArrayList<String> numerosTelefones = new ArrayList<>();
        for (Telefone telefone : t) {
            if(!(telefone == null)) {
                if(!(telefone.getNumero() == null)) {
                    String numero = telefone.getNumero();
                    numerosTelefones.add(numero);
                }
            }
        }
        this.telefones = numerosTelefones;
    }


}
