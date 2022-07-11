package aula24.Strategy;

public class CartaoCredito implements StrategyTaxa{

    private int qtdMaximaParcelas;

    public CartaoCredito (int qtdMaximaParcelas){
        this.qtdMaximaParcelas = qtdMaximaParcelas;
    }
    @Override
    public double calculaTaxa(Pedido pedido) {
        return pedido.getQtdParcelas() > qtdMaximaParcelas ? pedido.getValor() * 0.08 : 0;
    }
}
