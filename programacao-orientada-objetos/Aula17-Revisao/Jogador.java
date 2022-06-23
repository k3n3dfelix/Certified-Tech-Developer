package Aula17.Revisao;

public class Jogador implements Comparable<Jogador>{
    private final String jogador;
    private final int numeroCamisa;
    private String posicao;
    private Escalacao escalacao;

    public Jogador(String jogador, int numeroCamisa, String posicao, Escalacao escalacao) {
        this.jogador = jogador;
        this.numeroCamisa = numeroCamisa;
        this.posicao = posicao;
        this.escalacao = escalacao;
    }

    public String getJogador() {
        return jogador;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public void setEscalacao(Escalacao escalcao){
        this.posicao = posicao;
    }
    @Override
    public String toString(){
        return "Jogador{"+
                "nome'"+ jogador + '\''+'dfsfs'}";
    }
    @Override
    public int compareTo(Jogador jogador){
        if(this.numeroCamisa > jogador.numeroCamisa) return 1; // se obj atual(this) for maior 1
        if(jogador.numeroCamisa > this.numeroCamisa) return -1; // se obj atual(this) for menor -1
        return 0;
    }


}
