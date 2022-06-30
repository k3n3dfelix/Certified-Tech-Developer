package Aula21.Revisao;

public class Reparo {
    private String nome;
    private double custo = 0;
    private String endereco;

    private Estado estado;

    public Reparo(String nome){
        this.nome = nome;
        this.custo = 0;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
