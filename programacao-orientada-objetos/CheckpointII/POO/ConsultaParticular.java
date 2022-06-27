package CheckpointII.POO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConsultaParticular extends Consulta implements Comparable<Consulta>{
    private double valorConsulta;
    public ConsultaParticular(int idConsulta, LocalDate dataConsulta, String especialidade, LocalTime horaEMinutoConsulta) {
        super(idConsulta, dataConsulta, especialidade, horaEMinutoConsulta);
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double informarValorConsulta() {
        return getValorConsulta();
    }

    @Override
    public int compareTo(Consulta consulta) {
        if (getIdConsulta() > consulta.getIdConsulta()) return 1;
        if (getIdConsulta() < consulta.getIdConsulta()) return -1;
        return 0;
    }
}
