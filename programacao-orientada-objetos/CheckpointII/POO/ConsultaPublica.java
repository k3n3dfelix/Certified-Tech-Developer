package CheckpointII.POO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConsultaPublica extends Consulta implements Comparable<Consulta> {
    public ConsultaPublica(int idConsulta, LocalDate dataConsulta, String especialidade, LocalTime horaEMinutoConsulta) {
        super(idConsulta, dataConsulta, especialidade, horaEMinutoConsulta);
    }

    @Override
    public int compareTo(Consulta consulta) {
        if (getIdConsulta() > consulta.getIdConsulta()) return 1;
        if (getIdConsulta() < consulta.getIdConsulta()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Id Consulta: " + getIdConsulta() + ", Data da consulta: " + getDataConsulta() + ", Especialidade: " + getEspecialidade() + ", Horário: " + getHoraEMinutoConsulta() + "\n";
    }
}
