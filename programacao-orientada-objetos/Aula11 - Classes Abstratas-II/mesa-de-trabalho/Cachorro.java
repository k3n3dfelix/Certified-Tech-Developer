package aula11.ClassesAbsract.mesa;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String som, String acao) {
        super(nome, idade, som, acao);

    }

    @Override
    public String emitirSom(){
        return "Fiz Au Au";
    }

    @Override
    public String acao(){
        return "Vou correr";
    }
}
