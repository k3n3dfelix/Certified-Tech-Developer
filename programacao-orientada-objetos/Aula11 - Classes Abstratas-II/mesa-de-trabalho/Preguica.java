package aula11.ClassesAbsract.mesa;

public class Preguica extends Animal{

    public Preguica(String nome, int idade, String som, String acao) {
        super(nome, idade, som, acao);

    }

    @Override
    public String emitirSom(){
        return "Preguica";
    }

    @Override
    public String acao(){
        return "Vou subir na árvore";
    }
}
