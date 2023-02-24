package aula7.flywheight.mesa;

import aula7.flywheight.Computador;
import aula7.flywheight.ComputadorFactory;

public class Main {
    public static void main(String[] args){
        ArvoreFactory arvoreFactory = new ArvoreFactory();

        for (int i = 0; i < 333; i++) {
            Arvore a1 = arvoreFactory.getArvore(200+i, 400+i, "verde");
            System.out.println(a1.toString());
        }

        for (int i = 0; i < 333; i++) {
            Arvore a1 = arvoreFactory.getArvore(500+i, 300+i, "vermelho");
            System.out.println(a1.toString());
        }
        for (int i = 0; i < 333; i++) {
            Arvore a1= arvoreFactory.getArvore(100+i, 200+i, "azul");
            System.out.println(a1.toString());
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));


    }
}
