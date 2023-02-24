package aula8.facade.aulasincrona;

import aula7.flywheight.Computador;
import aula7.flywheight.ComputadorFactory;
import aula8.facade.aulasincrona.model.Cartao;
import aula8.facade.aulasincrona.model.Produto;
import aula8.facade.aulasincrona.service.impl.FacadeDesconto;

public class Main {
    public static void main(String[] args){
        FacadeDesconto facade = new FacadeDesconto();

        Cartao cartao = new Cartao("123456789", "Star Bank");
        Produto produto = new Produto("Milho", "Lata");

        System.out.println("Desconto" + facade.desconto(cartao, produto, 5));
    }
}
