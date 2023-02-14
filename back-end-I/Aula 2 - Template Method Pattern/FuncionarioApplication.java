package aula1.template.method.pattern.company;

public class FuncionarioApplication {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Efetivo("Marcos", "Antunes","123456789", 3000.0,1000.0,500.0);

        funcionario1.pagamentoSalario();

        Funcionario funcionario2 = new Contratado("Andre","Silva", "1564564564", 50.0, 50);
        funcionario2.pagamentoSalario();
    }
}
