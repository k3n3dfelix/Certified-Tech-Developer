package aula3.integradora;

public abstract class Vendedor {

    protected String nome;
    protected int vendas;
    protected int pontosPorVenda;

    public Vendedor(String nome, int vendas, int pontosPorVenda) {
        this.nome = nome;
        this.vendas = vendas;
        this.pontosPorVenda = pontosPorVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public int getPontosPorVenda() {
        return pontosPorVenda;
    }

    public void setPontosPorVenda(int pontosPorVenda) {
        this.pontosPorVenda = pontosPorVenda;
    }

    public void vender(int qtdVendas){
        this.vendas = 0;
        this.vendas += qtdVendas;
        System.out.println("Nome do vendedor: "+ this.nome + " e quatidade de vendas: " + this.vendas);
    }

    public abstract int calcularPontos();

    public String getNomeCategoria(int pontosVendedor){
        this.pontosPorVenda = pontosVendedor;

        if(pontosPorVenda < 20){
            return "Novato";
        }else if (pontosPorVenda >= 20 && pontosPorVenda <= 30 ){
            return "Aprendiz";
        }else if (pontosPorVenda > 30 && pontosPorVenda < 40 ){
             return "Bom";
        }else {
            return "Mestre";
        }
    }

    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return this.nome + " tem um total de " + pontosVendedor + " pontos e categoriza como " + getNomeCategoria(pontosVendedor);
    }
}
