package aula1.template.method.pattern.company.mesa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CardapioAdulto cardapioAdulto = new CardapioAdulto(25.00);
        CardapioInfantil cardapioInfantil = new CardapioInfantil(17.00);
        CardapioVegetariano cardapioVegetariano = new CardapioVegetariano(30.00);

        ItemAdicional item1 = new ItemAdicional("Batata", 10.00);
        ItemAdicional item2 = new ItemAdicional("Coca", 8.00);
        ItemAdicional item3 = new ItemAdicional("Sorvete", 9.00);

        List<ItemAdicional> listaAdulto = new ArrayList<>();
        List<ItemAdicional> listaInfantil = new ArrayList<>();
        List<ItemAdicional> listaVegetariano = new ArrayList<>();

        listaInfantil.add(item1);
        listaInfantil.add(item2);
        listaInfantil.add(item3);

        cardapioAdulto.montagem(listaAdulto);
        System.out.println();
        cardapioInfantil.montagem(listaInfantil);
        System.out.println();
        cardapioVegetariano.montagem(listaVegetariano);
    }
}
