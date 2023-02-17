package aula6.integradora.mesa;

public class SerieProxy implements ISerie{

    private int qtdViews;
    private Serie serie;

    public SerieProxy(Serie serie) {
        this.qtdViews = 0;
        this.serie = serie;
    }

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        if(qtdViews > 4){
            throw new SerieNaoHabilitadaException("Não será exibida");
        }else{
           qtdViews+=1;
           return serie.getSerie(nome);
        }
    }
}
