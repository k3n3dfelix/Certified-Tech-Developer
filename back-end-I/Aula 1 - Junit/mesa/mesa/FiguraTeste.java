package aula1.template.method.pattern.mesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTeste {
    Quadrado q1, q2;
    Circulo c1, c2;

    //indica que o método anotado deve ser executado antes de cada teste
    @BeforeEach
    void doBefore() {

        q1 = new Quadrado(5);
        q2 = new Quadrado(50);

        c1 = new Circulo(5);
        c2 = new Circulo(50);

    }

    @Test
    void imprimirObjeto() {
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularPerimetro());
        System.out.println(c1.calcularPerimetro());
        System.out.println(c2.calcularPerimetro());
    }

    @Test
    void testePerimetro() {
        assertEquals("25,12",String.format("%.2f",c1.calcularPerimetro()));
        assertEquals("25,12",String.format("%.2f",c2.calcularPerimetro()));
        assertEquals("20,00",String.format("%.2f",q1.calcularPerimetro()));
        assertEquals("20,00",String.format("%.2f",q2.calcularPerimetro()));
    }
}
