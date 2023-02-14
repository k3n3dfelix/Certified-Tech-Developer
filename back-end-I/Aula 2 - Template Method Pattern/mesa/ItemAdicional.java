package aula1.template.method.pattern.company.mesa;

public class ItemAdicional {
    private String nome;
    private double preco;

    public ItemAdicional(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ItemAdicional{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
