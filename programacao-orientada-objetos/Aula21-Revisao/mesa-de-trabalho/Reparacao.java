package Aula21.Revisao;

import java.util.List;

public class Reparacao implements Estado{

    @Override
    public void valorOrcamento(double valor) {
        throw new IllegalStateException("Valor já foi informado");
    }

    @Override
    public void somaReposicao(List<PecaReposicao> pecas) {
            double soma = 0;
            for(PecaReposicao peca:pecas){
                soma += peca.getValor();
            }
            reparo.setCusto(reparo.getCusto() + soma);
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Não pode mudar endereço");
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Envio(reparo));
    }
}
