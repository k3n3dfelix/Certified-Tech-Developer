package Aula21.Revisao;

import java.util.List;

public class Orcamento implements Estado{

    private Reparo reparo;

    public Orcamento(Reparo reparo){
        this.reparo = reparo;
    }
    @Override
    public void valorOrcamento(double valor){

    }

    @Override
    public void somaReposicao(List<PecaReposicao> pecas){
        throw new IllegalStateException("Voce precisa estar no estado de reparo");
    }

    @Override
    public void mudarEndereco(String endereco){
        throw new IllegalStateException("Voce não pode mudar o endereço");
    }

    @Override
    public void mudarEstado(){
        this.reparo.setEstado(new Reparacao(reparo));
    }
}
