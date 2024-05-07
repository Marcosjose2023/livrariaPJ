package com.livraria.livraria.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Livros {
    @Id
    private Long id;
    @NotBlank
    private String titulo;
    @NotNull
    @OneToOne
    private Autores autores;
    @NotNull
    @OneToOne
    @JsonIgnore
    private Editoras editoras;
    @NotNull
    @OneToOne
    @JsonIgnore
    private Categorias categorias;
    @NotNull
    private Double preco;
    @NotNull
    private boolean destaque;
    @NotBlank
    private String sumario;

    public Livros() {
    }

    public Livros(Autores autores, Categorias categorias, boolean destaque,Editoras editoras, Long id, Double preco, String sumario, String titulo) {
        this.autores = autores;
        this.categorias = categorias;
        this.destaque = destaque;
        this.editoras = editoras;
        this.id = id;
        this.preco = preco;
        this.sumario = sumario;
        this.titulo = titulo;
    }

    public Autores getAutores() {
        return autores;
    }

    public void setAutores(Autores autores) {
        this.autores = autores;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public Editoras getEditoras() {
        return editoras;
    }

    public void setEditoras(Editoras editoras) {
        this.editoras = editoras;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }
}
