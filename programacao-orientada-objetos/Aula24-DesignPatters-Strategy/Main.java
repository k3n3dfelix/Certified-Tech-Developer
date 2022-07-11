package aula24.Strategy;

public class Main {
    public static void main(String[] args){
        Pedido pedido = new Pedido(100, 10);
        Dinheiro dinheiro = new Dinheiro();
        CartaoCredito cartaoCredito = new CartaoCredito(6);

        CalcularTaxa calcularTaxa = new CalcularTaxa(cartaoCredito);
        System.out.println("O valor de taxa que você vai pagar é de: "+calcularTaxa.valorTaxa(pedido));
    }
}
