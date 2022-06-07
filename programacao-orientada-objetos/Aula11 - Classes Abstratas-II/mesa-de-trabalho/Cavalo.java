package aula11.ClassesAbsract.mesa;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade, String som, String acao) {
        super(nome, idade, som, acao);

    }

    @Override
    public String emitirSom(){
        return "Relinchei";
    }

    @Override
    public String acao(){
        return "Vou correr";
    }
}
