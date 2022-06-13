package Aula13.Interface;

public class ContaCorrente extends Conta implements GravaImposto{

    private double valorPermitido = 0;
    @Override
    public void sacar(double valor) {
        if(valor > getSaldo()){
            setSaldo(0);
        }else{
            setSaldo(getSaldo() - valor);
        }
    }

    @Override
    public void imposto(double porc) {

    }
}
