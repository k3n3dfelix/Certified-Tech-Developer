package Aula19.DesignPatters;

public class EmpregadoFactory {
    //Padrão Factory
    private static EmpregadoFactory instance;

    private EmpregadoFactory(){
    }

    public Empregado criarEmpregado(String nome,String tipo){
        if(tipo.equals("EMP-INT")){
            return new EmpregadoRelacaoDep(nome);
        }else if (tipo.equals("EMP-EXT")){
            return new EmpregadoContratado(nome);
        }
        throw new IllegalStateException("O tipo não existe");
        // ou  throw new RuntimeException("O tipo não existe");
    }

    //Padrão Singleton
    public static EmpregadoFactory getInstace(){
        if(instance == null){
            instance = new EmpregadoFactory();
        }
        return instance;
    }

}
