package com.livraria.livraria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
public class Enderecos {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @NotBlank
    private String cep;
    @NotBlank
    private String rua;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String cidade;
    @OneToMany
    private List<Clientes> clientes;

    public Enderecos(Long id, String cep, String rua, String logradouro, String cidade, List<Clientes> clientes) {
        this.id = id;
        this.cep = cep;
        this.rua = rua;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.clientes = clientes;
    }

    public List<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(List<Clientes> clientes) {
        this.clientes = clientes;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
