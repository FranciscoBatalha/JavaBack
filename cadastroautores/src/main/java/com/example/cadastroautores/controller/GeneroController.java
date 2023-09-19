package com.example.cadastroautores.controller;
import com.example.cadastroautores.model.Genero;
import com.example.cadastroautores.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "http://localhost:5173") // Endereço do front
@RestController

@RequestMapping("/generos")
public class GeneroController {
 @Autowired
    private GeneroRepository generoRepository;
 @GetMapping
    public List<Genero> listarGeneros() {
        return generoRepository.findAll();
    }
   @PostMapping
    public Genero criarCategoria(@RequestBody Genero genero) {
        return generoRepository.save(genero);
    }

}

