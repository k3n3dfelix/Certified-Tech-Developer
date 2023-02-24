package aula8.facade.mesa.service.impl;

import aula8.facade.aulasincrona.model.Cartao;
import aula8.facade.aulasincrona.model.Produto;
import aula8.facade.aulasincrona.service.ApiCartao;
import aula8.facade.aulasincrona.service.ApiProduto;
import aula8.facade.aulasincrona.service.ApiQuantidade;
import aula8.facade.mesa.model.Hotel;
import aula8.facade.mesa.model.Voo;
import aula8.facade.mesa.service.ApiHotel;
import aula8.facade.mesa.service.ApiVoo;
import aula8.facade.mesa.service.IFacadeBusca;

public class FacadeBusca implements IFacadeBusca {

    private ApiHotel apiHotel;
    private ApiVoo apiVoo;


    public FacadeBusca() {
        this.apiHotel = new ApiHotel();
        this.apiVoo = new ApiVoo();
    }

    @Override
    public String buscar(Hotel hotel, Voo voo) {
        String disponivel = "";

        if(apiHotel.buscaHotel(hotel) == "Hotel disponivel" && apiVoo.buscaVoo(voo) == "Voo disponivel"){
            disponivel = "Voo e Hotel Disponivel";
        }else {
            disponivel = "Voo e Hotel InDisponivel";
        }

        return disponivel;
    }
}
