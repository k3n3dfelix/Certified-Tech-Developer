package aula8.facade.aulasincrona.service;

import aula8.facade.aulasincrona.model.Produto;

public class ApiProduto {

    public int desconto(Produto produto){
        if(produto.getTipo().equalsIgnoreCase("Lata")){
            return 10;
        }else{
            return 0;
        }
    }
}
