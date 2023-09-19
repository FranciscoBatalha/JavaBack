package com.example.cadastroautores.repository;
import com.example.cadastroautores.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
}
