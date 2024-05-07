package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.Entity.Livros;
import com.livraria.livraria.Repository.AutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoresServices {
    @Autowired
     private AutoresRepository autoresRepository;

    Autores autores;

    public void adicionarAutor(Autores autores){
    autoresRepository.save(autores);
    }
    public List<Autores> listarTodosAutores(){
        return autoresRepository.findAll();
    }

    public Optional<Autores> buscarPorId(long id){
        return autoresRepository.findById(id);
    }
    public Autores editar(Autores autores){
        return autoresRepository.save(autores);
    }

    public Optional<Autores> buscarPorNome(String nome){
        return autoresRepository.findByNome(nome);
    }

    public void deletarAutor(Long id){
        autoresRepository.deleteById(id);
    }
    public void inativarAutor (Autores autores){
        autores.setAtivo(false);
    }
    public void ativarAutor (Autores autores){
        autores.setAtivo(true);
    }

}
