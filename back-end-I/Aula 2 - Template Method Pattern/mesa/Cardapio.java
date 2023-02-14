package aula1.template.method.pattern.company.mesa;

import java.util.List;

public abstract  class Cardapio {

    private double preco;

    public Cardapio(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract void montagem(List<ItemAdicional> items);

    public abstract double calcular(double valor);
}
