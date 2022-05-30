package aula6.mesa;

import aula6.Impressora;

import java.time.LocalDate;
import java.util.Date;

public class Cachorros {

    public static void main(String[] args) {

        Cachorro cachorroViraLata = new Cachorro(true,new Date(), 4.1,true, false, "Laika");
        Cachorro cachorroRaca = new Cachorro(true,"Chow-Chow",new Date(), 6.2,true, false, "Laika");

        cachorroViraLata.encaminharAdocao(false,4.5);
        cachorroRaca.encaminharAdocao(false,6.2);

    }
}
