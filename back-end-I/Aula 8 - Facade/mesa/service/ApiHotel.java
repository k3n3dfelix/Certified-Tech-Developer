package aula8.facade.mesa.service;

import aula8.facade.mesa.model.Hotel;

public class ApiHotel {

    public String buscaHotel(Hotel hotel){
        if (hotel.getCidade().equalsIgnoreCase("Campina")){
            return "Hotel disponivel";
        }else{
            return "Hotel indisponivel";
        }
    }
}
