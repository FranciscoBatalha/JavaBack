package com.example.cadastroautores.controller;
import com.example.cadastroautores.model.Autor;
import com.example.cadastroautores.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;
@CrossOrigin(origins = "http://localhost:5173")//Endereço do front
@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorRepository veiculoRepository;
    @GetMapping
    public List<Autor> listarVeiculos() {
        return veiculoRepository.findAll();
    }
    @PostMapping
    public Autor criarVeiculo(@RequestBody Autor autor) {
        return veiculoRepository.save(autor);
    }
     @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarVeiculo(@PathVariable Long id) {
        if (veiculoRepository.existsById(id)) {
            veiculoRepository.deleteById(id);
            return ResponseEntity.ok("Autor deletado com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> atualizarVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {
        if (veiculoRepository.existsById(id)) {
            Autor autor = autorRepository.findById(id).get();
            autor.setPlaca(autorAtualizado.getEdicao());
            autor.setMontadora(autorAtualizado.getEditora());
            autor.setModelo(autorAtualizado.getColecao());
            autor.setAno(autorAtualizado.getAno());

            Autor autorAtualizadoBD = autorRepository.save(autor);
            return ResponseEntity.ok(autorAtualizadoBD);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
