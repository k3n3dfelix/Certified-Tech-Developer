package Aula19.DesignPatters;

public class EmpregadoContratado extends Empregado{

    private double valorHora;
    private double imposto;

    public EmpregadoContratado(String nome) {
        super(nome);
    }

    public EmpregadoContratado(String nome, String sobreNome, String arquivo) {
        super(nome, sobreNome, arquivo);
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public double calcularSalario(int dias) {
        return (8 * dias) - (imposto * dias);
    }
}
