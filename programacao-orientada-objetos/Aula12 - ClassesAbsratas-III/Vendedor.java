package aula12.ClasseAbstract;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(
            String nome,
            String sobrenome,
            String cpf,
            String email,
            String matricula,
            double salario,
            double comissao
    ) {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.comissao = comissao;
    }

    @Override
    public void pagamento() {
        System.out.println("O vendedor vai receber: " + (getSalario() + comissao));
    }
}
