package Aula19.DesignPatters;

public class Main {
    public static void main(String[] args){
        EmpregadoFactory ef = new EmpregadoFactory();
        Empregado empregado = ef.criarEmpregado("Nome", "EMP-INT");
        Empregado empregado2 = ef.criarEmpregado("Nome", "EMP-EXT");


    }

}
