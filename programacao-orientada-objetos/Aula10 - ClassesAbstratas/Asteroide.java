package aula10.mesa;

public class Asteroide extends Objeto{

    private int danos;

    public Asteroide(int posX, int posY, char direcao, int danos){
        super(posX, posY, direcao);
        this.danos = danos;

    }

    @Override
    public String irA(int x, int y, char direcao){
        return "Voçe andou"+ x +"no eixo x e "+ y + "no eixo y na direção" + direcao;
    }
}
