package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Autores;
import com.livraria.livraria.Entity.Clientes;
import com.livraria.livraria.Entity.Contas;
import com.livraria.livraria.Services.ClientesServices;
import com.livraria.livraria.Services.ContasServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasController {

    private ContasServices contasServices;

    public ContasController(ContasServices contasServices) {
        this.contasServices = contasServices;
    }
    @PostMapping("/cadastrarConta")
    public void cadastrarContas(@Valid @RequestBody Contas contas) {
        contasServices.cadastrarConta(contas);
    }
    @GetMapping("/pegarContas")
    public List<Contas> getALLContas() {
        return contasServices.listarContas();
    }
    @DeleteMapping("/{id}")
    public void deletarContas(@PathVariable Long id) {
        contasServices.deletarContas(id);
    }

    @PutMapping("/editarContas")
    public Contas editar(@RequestBody Contas contas) {
        return contasServices.editar(contas);
    }

    @GetMapping("/listarContas")
    public List<Contas> listarContas() {
        return contasServices.listarContas();
    }
    @GetMapping("/buscarPorId")
    public Optional<Contas> buscarPorId(Long id) {
        return contasServices.buscarContas(id);
    }
}
