package Aula20.PadraoState;

public class Triste implements Estado{
    private Tamagochi tamagochi;

    public Triste(Tamagochi tamagochi){
        this.tamagochi = tamagochi;
    }

    @Override
    public void comer() {
        System.out.println("bip bip - vomitar");
    }

    @Override
    public void beber() {

    }

    @Override
    public void carinho() {

    }
}
