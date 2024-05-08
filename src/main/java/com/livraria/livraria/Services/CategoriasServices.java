package com.livraria.livraria.Services;

import com.livraria.livraria.Entity.Categorias;
import com.livraria.livraria.Entity.Clientes;
import com.livraria.livraria.Entity.Livros;
import com.livraria.livraria.Repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriasServices {

    private Categorias categorias;
    @Autowired
    CategoriasRepository categoriasRepository;

    public CategoriasServices(Categorias categorias) {
        this.categorias = categorias;
    }

    public List<Categorias> listarCategorias() {
        List<Categorias> Cat = categoriasRepository.findAll();
        return Cat;
    }
    public void criarCategorias(Categorias categorias){
        categoriasRepository.save(categorias);
    }
    public void ativar(boolean ativo){
        categorias.setAtivo(ativo);
    }

}
