package com.livraria.livraria.Repository;

import com.livraria.livraria.Entity.Editoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EditorasRepository extends JpaRepository<Editoras,Long> {
    Optional<Editoras> findByNome(String nome);
}
