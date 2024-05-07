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

    public EnderecosController(EnderecosServices enderecosServices) {
        this.enderecosServices = enderecosServices;
    }

    @PostMapping("/cadastrarEndereco")
    public void cadastrarEndereco(@Valid @RequestBody Enderecos enderecos) {
        enderecosServices.cadastrarEnderecos(enderecos);
    }
    @GetMapping("/pegarEnderecos")
    public List<Enderecos> getALLEnderecos() {
        return enderecosServices.listarTodosEnderecos();
    }
    @DeleteMapping("/{id}")
    public void deletarEnderecos(@PathVariable Long id) {
        enderecosServices.deletarEnderecos(id);
    }
    @PutMapping("/editarEnderecos")
    public Enderecos editar(@RequestBody Enderecos enderecos) {
        return enderecosServices.editar(enderecos);
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
