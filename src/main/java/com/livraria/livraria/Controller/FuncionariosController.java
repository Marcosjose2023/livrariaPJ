package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Enderecos;
import com.livraria.livraria.Entity.Funcionarios;
import com.livraria.livraria.Services.EnderecosServices;
import com.livraria.livraria.Services.FuncionariosServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FuncionariosController {

    private FuncionariosServices funcionariosServices;

    public FuncionariosController(FuncionariosServices funcionariosServices) {
        this.funcionariosServices = funcionariosServices;
    }
    @PostMapping("/cadastrarFuncionarios")
    public void cadastrarFuncionarios(@Valid @RequestBody Funcionarios funcionarios) {
        funcionariosServices.cadastrarFuncionarios(funcionarios);
    }
    @GetMapping("/pegartodosFuncionarios")
    public List<Funcionarios> getALLFuncionarios() {
        return funcionariosServices.listarTodosFuncionarios();
    }
    @DeleteMapping("/deletarFuncionario/{id}")
    public void deletarFuncionarios(@PathVariable long id) {
        funcionariosServices.deletarFuncionarios(id);
    }
    @PutMapping("/editarEnderecos")
    public Funcionarios editar (@RequestBody Funcionarios funcionarios) {
        return funcionariosServices.editar(funcionarios);
    }
    @GetMapping("/buscarFuncionarios")
    public Optional<Funcionarios> buscarFuncionarios(long id) {
        return funcionariosServices.buscarFuncionarios(id);
    }
}
