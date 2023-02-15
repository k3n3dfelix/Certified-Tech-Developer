package aula3.integradora;

public class Afiliado extends Vendedor{
    public Afiliado(String nome, int vendas, int pontosPorVenda) {
        super(nome, vendas, pontosPorVenda = 15);
    }


    @Override
    public int calcularPontos() {
        return this.vendas * pontosPorVenda;
    }
}
