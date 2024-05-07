package com.livraria.livraria.Repository;

import com.livraria.livraria.Entity.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecosRepository extends JpaRepository<Enderecos,Long> {
    Optional<Enderecos> findByCidade(String cidade);
}
