package com.livraria.livraria.Controller;

import com.livraria.livraria.Entity.Pedidos;
import com.livraria.livraria.Services.PedidosServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidosController {

    private PedidosServices pedidosServices;

    @GetMapping
    public List<Pedidos> listarTodosPedidos() {
        return pedidosServices.listarTodosPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> buscarPedidoPorId(@PathVariable Long id) {
        Optional<Pedidos> pedido = pedidosServices.buscarPedidoPorId(id);
        return pedido.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Pedidos> cadastrarPedido(@RequestBody Pedidos pedido) {
        Pedidos novoPedido = pedidosServices.cadastrarPedido(pedido);
        return new ResponseEntity<>(novoPedido, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarPedido(@PathVariable Long id, @RequestBody Pedidos pedidos) {
        pedidos.setId(id);
        pedidosServices.atualizarPedido(pedidos);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/inativar/{id}")
    public ResponseEntity<Void> inativarPedido(@PathVariable Long id) {
        pedidosServices.inativarPedido(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/ativar/{id}")
    public ResponseEntity<Void> ativarPedido(@PathVariable Long id) {
        pedidosServices.ativarPedido(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
