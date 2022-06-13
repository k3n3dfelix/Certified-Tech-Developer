package Aula13.Interface;

public abstract class Conta {

    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
