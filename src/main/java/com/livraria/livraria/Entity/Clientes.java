package com.livraria.livraria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Clientes extends Pessoas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    @OneToMany
    private List<Enderecos> enderecos;
    @NotBlank
    @OneToOne
    private Contas contas;
    private boolean ativo;


    public Clientes() {
    }

    public Clientes(LocalDate dataNascimento, String nome, Contas contas, List<Enderecos> enderecos, Long id,boolean ativo) {
        super(dataNascimento, nome);
        this.contas = contas;
        this.enderecos = enderecos;
        this.id = id;
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Enderecos> getEndereco() {
        return enderecos;
    }

    public void setEndereco(List<Enderecos> enderecos) {
        this.enderecos = enderecos;
    }

    public Contas getConta() {
        return contas;
    }

    public void setConta(Contas contas) {
        this.contas = contas;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}



