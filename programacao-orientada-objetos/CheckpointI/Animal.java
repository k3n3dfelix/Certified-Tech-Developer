package CheckpointI.POO.KenedFelix;

import java.util.Date;

public class Animal {

    private int Id;
    private String nome;
    private Date dataEntrada;
    private String cor;
    private String raca;
    private String porte;
    private double peso;

    public Animal(int id, String nome, Date dataEntrada, String cor, String raca, String porte, double peso) {
        Id = id;
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.cor = cor;
        this.raca = raca;
        this.porte = porte;
        this.peso = peso;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void adicionarAnimal(){

    }
}
