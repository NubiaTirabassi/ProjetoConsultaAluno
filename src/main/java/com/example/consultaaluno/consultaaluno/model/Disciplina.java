package com.example.consultaaluno.consultaaluno.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "DISCIPLINA")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "CARGA_HORARIA")
    private int cargaHoraria;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplinas;

}