package com.dao.materias.model;

public class Materia {

    private Integer id;
    private String nome;

    public Materia(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Materia(String nome) {
        this.nome = nome;
    }

    public Materia() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
