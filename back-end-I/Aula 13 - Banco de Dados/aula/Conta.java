public class Conta {
    private Long id;

    private String nome;
    private String conta;
    private double saldo;

    public Conta(String nome, String conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double valor){
        this.saldo += valor;

        return this.saldo;
    }
}
