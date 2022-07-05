package Aula22.Composite;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Item{

    private List<Produto> produtos;

    public Combo(String nome) {
        super(nome);
        this.produtos = new ArrayList<>();
    }

    public void addItens(Produto produto){
        this.produtos.add(produto);
    }

    @Override
    public double calcularPreco() {
        if(produtos.size() < 1) return 0;

        double total = 0;
        for(Produto produto: produtos){
            total += produto.calcularPreco();
        }
        return total;
    }
}
