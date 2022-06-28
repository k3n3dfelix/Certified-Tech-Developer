package Aula19.DesignPatters;

import java.util.List;

public class Empresa {
    private final String cnpj;
    private List<Empregado> empregados;

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setEmpregados(List<Empregado> empregados){
        this.empregados = empregados;
    }

    public List<Empregado> getEmpregados(){
        return empregados;
    }
}
