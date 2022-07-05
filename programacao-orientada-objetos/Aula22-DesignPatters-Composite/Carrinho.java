package Aula22.Composite;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itens;

    public Carrinho(){
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public double calcularValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.calcularPreco();
        }
        return total;
    }

}
