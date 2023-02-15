package aula3.integradora;

import aula1.template.method.pattern.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Vendedor{

    private int anosAntiguidade;
    private static List<Afiliado> colecaoAfiliado = new ArrayList();

    public Funcionario(String nome, int vendas, int pontosPorVenda, int anosAntiguidade) {
        super(nome, vendas, pontosPorVenda = 5);
        this.anosAntiguidade = anosAntiguidade;
    }

    @Override
    public int calcularPontos() {
            //int qtdAfiliados = colecaoAfiliado.size() * 10;
            //int qtdAnosAntiguidade =  anosAntiguidade * 5;
            //int qtdPontosPorVenda = PontosPorVenda * 5;
            //int totalPontos =  qtdAfiliados + qtdAnosAntiguidade + qtdPontosPorVenda;
            //System.out.println("Total" + totalPontos + "pontos");
        return ((this.colecaoAfiliado.size() * 10) + (this.anosAntiguidade * 5));


    }

    public void addFuncionario(Afiliado afiliado ){
        colecaoAfiliado.add(afiliado);
        System.out.println("o" + afiliado.getNome()+"é o novo afiliado adicionado pelo vendedor" + this.getNome());
    }
}
