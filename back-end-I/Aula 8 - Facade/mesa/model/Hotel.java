package aula8.facade.mesa.model;

import java.util.Date;

public class Hotel {

    private String nome;
    private Date entrada;
    private Date saida;
    private String cidade;

    public Hotel(String nome, Date entrada, Date saida, String cidade) {
        this.nome = nome;
        this.entrada = entrada;
        this.saida = saida;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getEntrada() {
        return entrada;
    }

    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
