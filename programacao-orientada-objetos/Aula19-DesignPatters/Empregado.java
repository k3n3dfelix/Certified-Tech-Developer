package Aula19.DesignPatters;

public abstract class Empregado {
    private String nome;
    private String sobreNome;
    private String arquivo;

    public Empregado(String nome){
        this.nome = nome;
    }

    public Empregado(String nome, String sobreNome, String arquivo){
        this(nome);
        this.sobreNome = sobreNome;
        this.arquivo = arquivo;
    }

    public abstract double calcularSalario(int dias);
}
