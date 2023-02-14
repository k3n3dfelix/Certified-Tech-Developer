package aula1.template.method.pattern.company.mesa;

import java.util.List;

public class CardapioInfantil extends Cardapio{
    public CardapioInfantil(double preco) {
        super(preco);
    }

    @Override
    public void montagem(List<ItemAdicional> items) {
        double valor = 0;
        for(ItemAdicional item : items) {
            valor += item.getPreco();
        }
        System.out.println("O seu cardápio infantil está sendo preparado");
        System.out.println("O valor total é: R$" + calcular(valor));
    }

    @Override
    public double calcular(double valor) {
        return getPreco() + valor;
    }
}
