package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Clientes;
import com.livraria.livraria.Services.ClientesServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    private ClientesServices clienteService;

    public ClienteController(ClientesServices clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/cadastrarClienteAndEdit")
    public void cadastrarCliente(@Valid @RequestBody Clientes cliente) {
        clienteService.cadastrarCliente(cliente);
    }

    @GetMapping("/pegarCliente")
    public List<Clientes> getALLCliente() {
        return clienteService.listarCliente();
    }

    @DeleteMapping("/deletarCliente/{id}")
    public void deletarCliente(@PathVariable long id) {
        clienteService.deletarCliente(id);
    }
//    @DeleteMapping("/{id}")
//    public void deletarCliente(@PathVariable Long id) {
//        clienteService.deletarCliente(id);
//    }

    @PutMapping("/editar")
    public Clientes editar(@RequestBody Clientes clientes) {
        return clienteService.editar(clientes);
    }

    @GetMapping("/listar")
    public List<Clientes> listarCliente() {
        return clienteService.listarCliente();
    }

//    @PutMapping("/{id}/inativar")
//    public void inativar(@PathVariable Long id) {
//        clienteService.inativar(id);
//    }
}
