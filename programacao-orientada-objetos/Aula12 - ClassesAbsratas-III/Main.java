package aula12.ClasseAbstract;

import java.util.List;

class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
                "Getente",
                "da Empresa",
                "cpf",
                "email",
                "matricula",
                10000.00,
                100000.00
        );
        gerente.pagamento();

        Secretaria secretaria = new Secretaria(
                "Secretária",
                "da Empresa",
                "cpf",
                "email",
                "matricula",
                10000.00
        );
        secretaria.pagamento();

        Vendedor vendedor = new Vendedor(
                "Vendedor",
                "da Empresa",
                "cpf",
                "email",
                "matricula",
                10000.00,
                5000.00
        );
        vendedor.pagamento();

        Empresa empresaDoZe = new Empresa("Empresa do Zé", "cnpj");
        empresaDoZe.addFuncionario(gerente);
        empresaDoZe.addFuncionario(secretaria);
        empresaDoZe.addFuncionario(vendedor);

        List<Funcionario> funcionariosDaEmpresaDoZe = empresaDoZe.getFuncionarios();

        for(int i = 0; i < funcionariosDaEmpresaDoZe.size(); i++) {
            if (funcionariosDaEmpresaDoZe.get(i).getNome().equals("Secretária")) {
                funcionariosDaEmpresaDoZe.get(i).pagamento();
            }
        }
    }
}
