package com.livraria.livraria.Repository;

import com.livraria.livraria.Entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes,Long> {

    void deleteAllById(Long id);
}
