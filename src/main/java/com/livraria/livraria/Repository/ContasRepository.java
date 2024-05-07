package com.livraria.livraria.Repository;

import com.livraria.livraria.Entity.Contas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasRepository extends JpaRepository<Contas, Long> {
    void deleteAllById(Long id);
}
