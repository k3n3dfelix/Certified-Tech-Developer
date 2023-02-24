package aula7.flywheight;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    private static Map<String, Computador> flyweight = new HashMap<>();

    public Computador getComputador(int ram, int hd){

        String id = "id" + ram + " : " + hd;

        System.out.println(id);

        if(!flyweight.containsKey(id)){
            Computador computador = new Computador(ram,hd);
            flyweight.put(id,computador);
            System.out.println("Pc Criado");
        }else{
            System.out.println("PC Obtido");
        }


        return flyweight.get(id);
    }
}
