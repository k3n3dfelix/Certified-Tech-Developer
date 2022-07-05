package Aula22.Composite;

public class Produto extends Item{

    private final double preco;
    private final static double MINIMO_VALOR = 1;

    public Produto(String nome, double preco) {
        super(nome);
        if(preco < 0){
            this.preco = MINIMO_VALOR;
        }else {
            this.preco = preco;
        }
    }

    @Override
    public double calcularPreco() {
        return preco;
    }
}
