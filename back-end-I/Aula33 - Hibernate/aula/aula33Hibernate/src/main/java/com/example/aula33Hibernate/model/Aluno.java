package com.example.aula33Hibernate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name="professor_id")
    private Professor professor;

    public Aluno(Long id, String nome, int idade, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.professor = professor;
    }
}
