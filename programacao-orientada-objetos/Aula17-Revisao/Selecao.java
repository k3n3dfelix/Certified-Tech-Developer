package Aula17.Revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Selecao {

    private String nome;
    private final Set<Jogador> jogadores;

    public Selecao(Set<Jogador> jogadores){
        this.jogadores = jogadores;
        this.nome = "fantasma";
    }

    public Selecao(String nome){
        this.nome = nome;
        this.jogadores = new TreeSet<>();
    }

    public void addJogador(Jogador jogador){
        jogadores.add(jogador);
    }

    public void addListJogador(List<Jogador> jogadores){
        this.jogadores.addAll(jogadores);
    }


}
