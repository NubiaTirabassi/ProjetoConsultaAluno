package com.example.consultaaluno.consultaaluno.model;
import jakarta.persistence.*;
import lombok.Data;

@Data //para fazer os métodos GET/SET
@Entity //ORM gerencia o estado objeto a ser criado à partir da classe concreta
@Table (name = "ALUNO")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    private String endereco;
}