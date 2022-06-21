package Aula14.Colecoes.exercicioGuiado;

import java.util.Objects;

public class Jogador {
    private String nome;
    private int numCamisa;

    public Jogador(String nome, int numCamisa) {
        this.nome = nome;
        this.numCamisa = numCamisa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jogador)) return false;
        Jogador jogador = (Jogador) o;
        return numCamisa == jogador.numCamisa && nome.equals(jogador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numCamisa);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    @Override
    public String toString(){
        return "nome: "+ nome + " num camisa: " + numCamisa;
    }
}
