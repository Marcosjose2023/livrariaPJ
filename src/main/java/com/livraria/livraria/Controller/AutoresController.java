package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.Services.AutoresServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutoresController {
    @Autowired
    AutoresServices services;

    @GetMapping("/listarAutores")
    public List<Autores> listarAutores(){
        return services.listarTodosAutores();
    }

    @GetMapping("/buscarPorId")
    public Optional<Autores> buscarPorId(Long id){
        return services.buscarPorId(id);
    }
    @GetMapping("/buscarPorNome")
    public Optional<Autores> buscarPorNome(String nome){
        return services.buscarPorNome(nome);
    }
    @PostMapping("/adicionarAutor")
    public void adicionarAutor(@RequestBody @Valid Autores autores){
        services.adicionarAutor(autores);
    }

    @PutMapping("/editarAutor")
    public Autores editar(Autores autores){
       return services.editar(autores);
    }

    @DeleteMapping("/deletarAutor")
    public void deletar(Long id){
        services.deletarAutor(id);
    }
}
