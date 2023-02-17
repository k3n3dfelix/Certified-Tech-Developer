package aula6.integradora.mesa;

public class Serie implements ISerie{



    @Override
    public String getSerie(String nome) {
        return "www."+ nome + ".com";
    }
}
