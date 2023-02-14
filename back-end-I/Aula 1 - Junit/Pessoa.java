package aula1.template.method.pattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate idade;
    private List<Pessoa> colecao = new ArrayList<>();

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<Pessoa> getColecao() {
        return colecao;
    }

    public void setColecao(List<Pessoa> colecao) {
        this.colecao = colecao;
    }

    public List<Pessoa> adicionarNomes(Pessoa p){
        if(p.getNome().length() > 5 && p.Idade() >= 18){
            colecao.add(p);

        }
        return colecao;
    }

    public int Idade() {
        int idade = Period.between(this.idade, LocalDate.of(2023,02,13)).getYears();
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", colecao=" + colecao +
                '}';
    }
}
