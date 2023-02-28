package aula10.log4j;

import java.util.logging.Logger;

import java.util.List;

public class ListaMedia {

    private static final Logger logger = Logger.getLogger(String.valueOf(ListaMedia.class));

    private List<Integer> lista;

    public ListaMedia(List<Integer> lista) throws Exception{
        this.lista = lista;
        comparaLista(lista);
    }

    public void comparaLista(List<Integer> inteiros) throws Exception{
        if(inteiros.size() > 5) {
            logger.info("O comprimento da lista é maior que 5");
        }
        if(inteiros.size() > 10) {
            logger.info("O comprimento da lista é maior que 10");
        }

        if(inteiros.size() == 0){
            throw new Exception();
        }
    }

    public int media() {
        int soma = 0;

        for(Integer inteiro: lista){
            soma += inteiro;
        }

        int media = soma / lista.size();
        logger.info("A media da lista é: " + media);

        return media;
    }
}
