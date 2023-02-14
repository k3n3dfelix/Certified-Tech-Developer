package aula1.template.method.pattern.mesa;

public class Quadrado extends Figura{
    public Quadrado(double comprimento) {
        super(comprimento);
    }

    public double calcularPerimetro() {

        return 4 * getComprimento();
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "comprimento=" + getComprimento() +
                '}';
    }
}
