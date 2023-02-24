package aula8.facade.aulasincrona.service;

import aula8.facade.aulasincrona.model.Cartao;
import aula8.facade.aulasincrona.model.Produto;

public interface IFacadeDesconto {
    int desconto(Cartao cartao, Produto produto, int quantidade);
}
