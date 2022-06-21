package Aula14.Colecoes;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello","World",};
        words[0] = "test";

        List<String> strings = new LinkedList<>();
        strings.add("Francisco");
        strings.add("Bruno");
        strings.add("Rafael");
        strings.remove(0);
        strings.get(0);


        //Array
        //LinkedList -> remove os itens iguais e ordena
        //HAshset -> remove os itens iguais e não odena
        //ArrayList -> não remove e mantem como foi adicionado
    }
}
