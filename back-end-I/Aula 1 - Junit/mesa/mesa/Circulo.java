package aula1.template.method.pattern.mesa;

public class Circulo extends Figura{

    public Circulo(double comprimento) {
        super(comprimento);
    }

    public double calcularPerimetro() {
        return 2 * getComprimento() * Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "comprimento=" + getComprimento() +
                '}';
    }
}
