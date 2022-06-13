package CheckpointI.POO.KenedFelix;

public class Adotante extends Pessoa{

    private String endereco;
    private int numero;
    private String bairro;

    public Adotante(int id, String nome, String sobrenome, String endereco, int numero, String bairro) {
        super(id, nome, sobrenome);
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
