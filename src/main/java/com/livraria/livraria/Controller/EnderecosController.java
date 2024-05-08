package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Editoras;
import com.livraria.livraria.Entity.Enderecos;
import com.livraria.livraria.Services.EditoresServices;
import com.livraria.livraria.Services.EnderecosServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecosController {

    private EnderecosServices enderecosServices;

    @PostMapping("/cadastrarEndereco")
    public void cadastrarEndereco(@Valid @RequestBody Enderecos enderecos) {
        enderecosServices.cadastrarEnderecos(enderecos);
    }
    @DeleteMapping("/{id}")
    public void deletarEnderecos(@PathVariable Long id) {
        enderecosServices.deletarEnderecos(id);
    }
    @PutMapping("/editarEnderecos")
    public Enderecos editarEndereco (@RequestBody Enderecos enderecos) {
        return enderecosServices.editarEnderecos(enderecos);
    }
    @GetMapping("/listarEnderecos")
    public List<Enderecos> listarEnderecos() {
        return enderecosServices.listarTodosEnderecos();
    }
    @GetMapping("/buscarPelaCidade")
    public Optional<Enderecos> buscarPorId(String cidade) {
        return enderecosServices.buscarPeloCidade(cidade);
    }
}
