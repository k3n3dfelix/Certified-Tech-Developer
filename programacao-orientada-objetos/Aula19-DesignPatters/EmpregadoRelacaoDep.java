package Aula19.DesignPatters;

public class EmpregadoRelacaoDep extends Empregado{
    private double salarioMensal;
    public EmpregadoRelacaoDep(String nome) {
        super(nome);
    }

    public EmpregadoRelacaoDep(String nome, String sobreNome, String arquivo) {
        super(nome, sobreNome, arquivo);
    }

    @Override
    public double calcularSalario(int dias){
        return (salarioMensal/30) * dias;
    }
}
