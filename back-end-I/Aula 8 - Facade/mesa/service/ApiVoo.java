package aula8.facade.mesa.service;

import aula8.facade.mesa.model.Hotel;
import aula8.facade.mesa.model.Voo;

public class ApiVoo {

    public String buscaVoo(Voo voo){
        if (voo.getCidade_destino().equalsIgnoreCase("Campinas")){
            return "Voo disponivel";
        }else{
            return "Voo indisponivel";
        }
    }
}
