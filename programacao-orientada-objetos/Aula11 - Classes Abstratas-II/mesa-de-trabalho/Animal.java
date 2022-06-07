package aula11.ClassesAbsract.mesa;

public abstract class Animal {

    private String nome;
    private int idade;
    private String Som;
    private String Acao;

    public Animal(String nome, int idade, String som, String acao) {
        this.nome = nome;
        this.idade = idade;
        Som = som;
        Acao = acao;
    }

    public abstract String emitirSom();

    public abstract String acao();
}
