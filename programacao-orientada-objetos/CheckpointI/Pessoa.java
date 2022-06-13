package CheckpointI.POO.KenedFelix;

public class Pessoa {
    private int Id;
    private String nome;
    private String sobrenome;

    public Pessoa(int id, String nome, String sobrenome) {
        Id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
