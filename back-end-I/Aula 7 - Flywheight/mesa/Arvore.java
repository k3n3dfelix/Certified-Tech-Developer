package aula7.flywheight.mesa;

public class Arvore {

    private int largura;
    private int altura;
    private String  cor;

    public Arvore(int largura, int altura, String cor) {
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", cor='" + cor + '\'' +
                '}';
    }
}
