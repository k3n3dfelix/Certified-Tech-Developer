package aula10.mesa;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int posX, int posY, char direcao, double velocidade, int vida){
        super(posX, posY, direcao);
        this.velocidade = velocidade;
    }

    @Override
    public String irA(int x, int y, char direcao){
        return "Voçe andou"+ x +"no eixo x e "+ y + "no eixo y na direção" + direcao;
    }

    public void girar(char direcao){
        super.setDirecao(direcao);
    }

    public void restaVida(int valor){
        this.vida -= valor;
    }
}
