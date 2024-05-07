package com.livraria.livraria.Repository;

import com.livraria.livraria.Entity.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos,Long> {
}
