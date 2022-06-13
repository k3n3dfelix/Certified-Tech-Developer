package CheckpointI.POO.KenedFelix;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Voluntario extends Pessoa{

    private boolean ativo;
    private int horasVoluntarias;
    private Date data;

    public Voluntario(int id, String nome, String sobrenome, boolean ativo, int horasVoluntarias, Date data) {
        super(id, nome, sobrenome);
        this.ativo = ativo;
        this.horasVoluntarias = horasVoluntarias;
        this.data = data;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getHorasVoluntarias() {
        return horasVoluntarias;
    }

    public void setHorasVoluntarias(int horasVoluntarias) {
        this.horasVoluntarias = horasVoluntarias;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void trabalhar(Voluntario voluntario){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Voluntario: "+voluntario.getNome() + " ira trabalhar na data "+ formatador.format(voluntario.getData())+" por "+voluntario.getHorasVoluntarias()+ " horas");
    }

}
