package com.livraria.livraria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    @OneToOne
    private Clientes clientes;
    @OneToMany
    private List<Livros> itens;
    private boolean ativo;

    public Pedidos(Long id, Clientes clientes, List<Livros> itens, boolean ativo) {
        this.id = id;
        this.clientes = clientes;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public List<Livros> getItens() {
        return itens;
    }

    public void setItens(List<Livros> itens) {
        this.itens = itens;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
