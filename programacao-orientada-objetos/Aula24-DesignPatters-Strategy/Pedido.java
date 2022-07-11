package aula24.Strategy;

public class Pedido {

    private double valor;
    private final int qtdParcelas;

    public Pedido(double valor, int qtdParcelas){
        this.valor = valor;
        this.qtdParcelas = qtdParcelas <= 0 ? 1 : qtdParcelas;

    }

    public double getValor() {
        return valor;
    }

    public int getQtdParcelas() {
        return qtdParcelas;
    }
}
