package com.example.cadastroautores.repository;


import com.example.cadastroautores.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepository extends JpaRepository<Autor, Long> {
}

