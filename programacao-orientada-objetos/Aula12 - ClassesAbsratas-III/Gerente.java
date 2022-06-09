package aula12.ClasseAbstract;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(
            String nome,
            String sobrenome,
            String cpf,
            String email,
            String matricula,
            double salario,
            double bonus
    ) {
        super(nome, sobrenome, cpf, email, matricula, salario);
        this.bonus = bonus;
    }

    @Override
    public void pagamento() {
        System.out.println("O pagamento do gerente é de " + (getSalario() + bonus));
    }
}