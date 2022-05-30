package aula6.mesa;

import java.util.Date;

public class Cachorro {

    private Boolean aptoAdocao;
    private String raca;
    private Date ano;
    private Double peso;
    private Boolean temChip;
    private Boolean estaFerido;
    private String nome;

    public Cachorro(Boolean aptoAdocao, String raca, Date ano, Double peso, Boolean temChip, Boolean estaFerido, String nome) {
        this.aptoAdocao = aptoAdocao;
        this.raca = raca;
        this.ano = ano;
        this.peso = peso;
        this.temChip = temChip;
        this.estaFerido = estaFerido;
        this.nome = nome;
    }

    public Cachorro(Boolean aptoAdocao, Date ano, Double peso, Boolean temChip, Boolean estaFerido, String nome) {
        this.aptoAdocao = aptoAdocao;
        this.ano = ano;
        this.peso = peso;
        this.temChip = temChip;
        this.estaFerido = estaFerido;
        this.nome = nome;
        this.raca = "SRD";

    }

    public Boolean getAptoAdocao() {
        return aptoAdocao;
    }

    public void setAptoAdocao(Boolean aptoAdocao) {
        this.aptoAdocao = aptoAdocao;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getTemChip() {
        return temChip;
    }

    public void setTemChip(Boolean temChip) {
        this.temChip = temChip;
    }

    public Boolean getEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(Boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void encaminharAdocao(Boolean estaFerido, Double peso){
        if(estaFerido){
            System.out.println("Cachorro Não pode ser adotado");
        }else if(peso < 5){
            System.out.println("Cachorro Não pode ser adotado");
        }else{
            System.out.println("Cachorro pode ser adotado");
        }
    }
}
