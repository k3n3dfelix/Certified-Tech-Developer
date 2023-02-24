package aula7.flywheight.mesa;

import aula7.flywheight.Computador;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> flyweight = new HashMap<>();

    public Arvore getArvore(int largura, int altura, String cor){

        String id = "id" + largura + " : " + altura + ": " + cor;

        System.out.println(id);

        if(!flyweight.containsKey(id)){
            Arvore  arvore = new Arvore(largura,altura, cor);
            flyweight.put(id,arvore);
            System.out.println("Arvore Plantada");
        }else{
            System.out.println("Arvore com este padrão já existente");
        }

        return flyweight.get(id);
    }
}
