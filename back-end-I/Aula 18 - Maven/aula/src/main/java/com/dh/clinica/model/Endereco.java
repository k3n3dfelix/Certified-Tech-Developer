package com.dh.clinica.model;

public class Endereco {

    private int id;
    private String rua;
    private String numero;
    private String Bairro;
    private String Cidade;

    public Endereco(int id, String rua, String numero, String bairro, String cidade) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        Bairro = bairro;
        Cidade = cidade;
    }

    public Endereco(String rua, String numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        Bairro = bairro;
        Cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", Bairro='" + Bairro + '\'' +
                ", Cidade='" + Cidade + '\'' +
                '}';
    }
}
