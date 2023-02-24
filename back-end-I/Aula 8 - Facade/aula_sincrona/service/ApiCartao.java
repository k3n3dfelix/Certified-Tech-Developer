package aula8.facade.aulasincrona.service;

import aula8.facade.aulasincrona.model.Cartao;

public class ApiCartao {


    public int desconto(Cartao cartao) {

        if (cartao.getBanco().equalsIgnoreCase("Star Bank")){
            return 20;
        }else{
            return 0;
        }
    }
}
