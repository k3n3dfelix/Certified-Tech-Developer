package Aula21.Revisao;

import java.util.List;

public interface Estado {
    void valorOrcamento(double valor);
    void somaReposicao(List<PecaReposicao> pecas);
    void mudarEndereco(String endereco);
    void mudarEstado();
}
