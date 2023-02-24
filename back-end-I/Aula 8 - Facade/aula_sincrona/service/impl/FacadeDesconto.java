package aula8.facade.aulasincrona.service.impl;

import aula8.facade.aulasincrona.model.Cartao;
import aula8.facade.aulasincrona.model.Produto;
import aula8.facade.aulasincrona.service.ApiCartao;
import aula8.facade.aulasincrona.service.ApiProduto;
import aula8.facade.aulasincrona.service.ApiQuantidade;
import aula8.facade.aulasincrona.service.IFacadeDesconto;

public class FacadeDesconto implements IFacadeDesconto {

    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto() {
        this.apiCartao = new ApiCartao();
        this.apiProduto = new ApiProduto();
        this.apiQuantidade = new ApiQuantidade();
    }

    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade) {
        int desconto = 0;

        desconto = desconto + apiCartao.desconto(cartao);
        desconto = desconto + apiProduto.desconto(produto);
        desconto = desconto + apiQuantidade.desconto(quantidade);

        return desconto;
    }
}
