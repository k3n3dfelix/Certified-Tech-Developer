package aula6.integradora.mesa;

import aula5.proxy.Pessoa;
import aula5.proxy.ServicoVacinarProxy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class SerieTest {

    @Test
    @DisplayName("Ver Serie")
    void verSerie(){


        SerieProxy s1 = new SerieProxy(new Serie());
        try{
            System.out.println(s1.getSerie("The_Last_of_Us"));
            System.out.println(s1.getSerie("The_Last_of_Us"));
            System.out.println(s1.getSerie("The_Last_of_Us"));
            System.out.println(s1.getSerie("The_Last_of_Us"));
            System.out.println(s1.getSerie("The_Last_of_Us"));
            System.out.println(s1.getSerie("The_Last_of_Us"));
        }catch(SerieNaoHabilitadaException exception){
            System.out.println(exception);
        }

    }
}
