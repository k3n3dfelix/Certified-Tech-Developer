package Aula22.Composite;

public abstract class Item {

    private String nome;

    public Item(String nome){
        this.nome = nome;
    }

    public abstract double calcularPreco();

}
