package com.dh.hoteis.model;

public class Filial {

    private Integer id;
    private String nome;
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private boolean e5estrelas;

    public Filial(Integer id, String nome, String rua, int numero, String cidade, String estado, boolean e5estrelas) {
        this.id = id;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5estrelas = e5estrelas;
    }

    public Filial(String nome, String rua, int numero, String cidade, String estado, boolean e5estrelas) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5estrelas = e5estrelas;
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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean getE5estrelas() {
        return e5estrelas;
    }

    public void setE5estrelas(boolean e5estrelas) {
        this.e5estrelas = e5estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", e5estrelas=" + e5estrelas +
                '}';
    }
}
