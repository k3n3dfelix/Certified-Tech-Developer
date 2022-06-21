package Aula14.Colecoes.exercicioGuiado;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Jogador> jogadores;

    public Equipe() {

        this.jogadores = new ArrayList<>();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void addJogador(Jogador jogador){
        jogadores.add(jogador);
    }





}
