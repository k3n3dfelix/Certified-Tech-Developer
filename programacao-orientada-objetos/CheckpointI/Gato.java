package CheckpointI.POO.KenedFelix;

import java.util.Date;

public class Gato extends Animal{

    private String garras;

    public Gato(int id, String nome, Date dataEntrada, String cor, String raca, String porte, double peso, String garras) {
        super(id, nome, dataEntrada, cor, raca, porte, peso);
        this.garras = garras;
    }

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }
}
