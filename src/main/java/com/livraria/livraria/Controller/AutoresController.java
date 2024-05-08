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
    private AutoresServices autoresServices;

    @GetMapping("/listarAutores")
    public List<Autores> listarAutores(){
        return autoresServices.listarTodosAutores();
    }

    @GetMapping("/buscarPorId")
    public Optional<Autores> buscarPorId(Long id){
        return autoresServices.buscarPorId(id);
    }
    @GetMapping("/buscarPorNome")
    public Optional<Autores> buscarPorNome(String nome){
        return autoresServices.buscarPorNome(nome);
    }
    @PostMapping("/adicionarAutor")
    public void adicionarAutores(@RequestBody @Valid Autores autores){
        autoresServices.adicionarAutor(autores);
    }

    @PutMapping("/editarAutor")
    public Autores editarAutores (Autores autores){
       return autoresServices.editar(autores);
    }

    @DeleteMapping("/deletarAutor")
    public void deletar(Long id){
        autoresServices.deletarAutor(id);
    }
}
