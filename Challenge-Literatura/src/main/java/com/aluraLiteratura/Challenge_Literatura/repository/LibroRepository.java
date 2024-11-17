package com.aluraLiteratura.Challenge_Literatura.repository;

import com.aluraLiteratura.Challenge_Literatura.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {
    Optional<Libro> findByTitulo(String titulo);
}
