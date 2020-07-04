package com.exercio.exercicio_3.model;

import javax.persistence.*;

@Entity
@Table(name="telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idtelefone")
    private Long id;

    @Column(name="numero")
    private String numero;

    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        if(this.numero == null)
            return "";
        else
            return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
