package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Categorias;
import com.livraria.livraria.Entity.Livros;
import com.livraria.livraria.Repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosServices {


    private LivrosRepository livrosRepository;

    private Livros livros;

    public LivrosServices(LivrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }

    public void cadastrarLivros(Livros livros) {
        livrosRepository.save(livros);
    }

    public List<Livros> listarTodosLivros() {
        return livrosRepository.findAll();
    }

    public Optional<Livros> buscarPorId(long id) {
        return livrosRepository.findById(id);
    }

    public Livros editar(Livros livros) {
        return livrosRepository.save(livros);
    }

    public Optional<Livros> buscarPorTitulo(String titulo) {
        return livrosRepository.findByTitulo(titulo);
    }

    public Optional<Livros> buscarPorCategoria(Categorias categorias) {
        return livrosRepository.findByCategorias(categorias);
    }

    public List<Livros> destaque() {
        if (livros.isDestaques() == true) {
            return livrosRepository.findAll();
        }
        throw new RuntimeException("Nenhum livro encontrado");
    }

   /* public List<Livros> destacarLivrosPorAno(int ano) {
        return livrosRepository.findAllByAno(ano);*/

}