package aula1.template.method.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.time.LocalDate;

public class PessoaTest {
    Pessoa p1;
    Pessoa p2;
    Pessoa p3;
    Pessoa p4;
    Pessoa p5;
    Pessoa p6;
    Pessoa p7;
    Pessoa p8;
    Pessoa p9;
    Pessoa p10;

    public PessoaTest() {
    }

    @BeforeEach
    void doBefore() {
        this.p1 = new Pessoa("Ivo", "Ganda");
        this.p1.setIdade(LocalDate.of(2016, 3, 23));
        this.p2 = new Pessoa("Ana", "Musk");
        this.p2.setIdade(LocalDate.of(1966, 1, 3));
        this.p3 = new Pessoa("Joe", "Morello");
        this.p3.setIdade(LocalDate.of(2010, 12, 4));
        this.p4 = new Pessoa("Rob", "Johnson");
        this.p4.setIdade(LocalDate.of(1976, 10, 25));
        this.p5 = new Pessoa("Ted", "Trujillo");
        this.p5.setIdade(LocalDate.of(2014, 5, 14));
        this.p6 = new Pessoa("Robert", "Traids");
        this.p6.setIdade(LocalDate.of(2000, 3, 30));
        this.p7 = new Pessoa("Renata", "Castro");
        this.p7.setIdade(LocalDate.of(2010, 1, 18));
        this.p8 = new Pessoa("Murilo", "Bianch");
        this.p8.setIdade(LocalDate.of(2015, 7, 11));
        this.p9 = new Pessoa("Candido", "Silveira");
        this.p9.setIdade(LocalDate.of(1975, 9, 1));
        this.p10 = new Pessoa("Camila", "Porto");
        this.p10.setIdade(LocalDate.of(2014, 5, 25));
    }

    @Test
    void imprimirObjetos() {
        System.out.println(this.p1.toString());
        System.out.println(this.p2.toString());
        System.out.println(this.p3.toString());
        System.out.println(this.p4.toString());
        System.out.println(this.p5.toString());
        System.out.println(this.p6.toString());
        System.out.println(this.p7.toString());
        System.out.println(this.p8.toString());
        System.out.println(this.p9.toString());
        System.out.println(this.p10.toString());
    }

    @Test
    void adicionarColecao() {
        this.p1.adicionarNomes(this.p1);
        this.p2.adicionarNomes(this.p2);
        this.p3.adicionarNomes(this.p3);
        this.p4.adicionarNomes(this.p4);
        this.p5.adicionarNomes(this.p5);
        this.p6.adicionarNomes(this.p6);
        this.p7.adicionarNomes(this.p7);
        this.p8.adicionarNomes(this.p8);
        this.p9.adicionarNomes(this.p9);
        this.p10.adicionarNomes(this.p10);
        System.out.println();
        PrintStream var10000 = System.out;
        int var10001 = Pessoa.getColecao().size();
        var10000.println("Quantidade de elementos inseridos na lista: " + var10001);
        Assertions.assertEquals(Pessoa.getColecao().size() == 2, true);
    }
}
