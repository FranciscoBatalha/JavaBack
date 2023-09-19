package com.example.cadastroautores.model;
import jakarta.persistence.*;




@Entity
public class Autor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edicao;
    private String editora;
    private String colecao;
    private int ano;


    // getters e setters
}
