package CheckpointI.POO.KenedFelix;

import java.util.Date;

public class Cachorro extends Animal{

    private int denticao;

    public Cachorro(int id, String nome, Date dataEntrada, String cor, String raca, String porte, double peso, int denticao) {
        super(id, nome, dataEntrada, cor, raca, porte, peso);
        this.denticao = denticao;
    }

    public int getDenticao() {
        return denticao;
    }

    public void setDenticao(int denticao) {
        this.denticao = denticao;
    }
}
