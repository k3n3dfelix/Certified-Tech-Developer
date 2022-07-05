package Aula22.Composite;

public class Main {
    public static void main(String[] args){
        Carrinho carrinho = new Carrinho();
        Produto refri = new Produto("Refri", 7.5);
        Item batata = new Produto("BAtata", 4.98);
        Item hamburguer = new Produto("HAmburguer", 8.75);

        Combo combo = new Combo("Combo felix");
        combo.addItens((Produto)refri);
        combo.addItens((Produto)batata);

        carrinho.addItem(refri);
        carrinho.addItem(combo);
        System.out.println(carrinho.calcularValorTotal());
    }

}
