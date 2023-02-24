package aula8.facade.mesa;

import aula8.facade.aulasincrona.model.Cartao;
import aula8.facade.aulasincrona.model.Produto;
import aula8.facade.aulasincrona.service.impl.FacadeDesconto;
import aula8.facade.mesa.model.Hotel;
import aula8.facade.mesa.model.Voo;
import aula8.facade.mesa.service.impl.FacadeBusca;

import java.util.Date;

public class Main {

    public static void main(String[] args){
        FacadeBusca facade = new FacadeBusca();

        Hotel hotel = new Hotel("Imperio", new Date(), new Date(), "Campinas");
        Voo voo = new Voo( new Date(), new Date(), "Franca", "Campinas");

        String verificacao = facade.buscar(hotel, voo);

        System.out.println(verificacao);
    }
}
