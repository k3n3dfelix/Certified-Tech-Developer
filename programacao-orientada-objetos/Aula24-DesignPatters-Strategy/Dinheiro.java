package aula24.Strategy;

public class Dinheiro implements  StrategyTaxa{

    @Override
    public double calculaTaxa(Pedido pedido) {
        return 0;
    }
}
