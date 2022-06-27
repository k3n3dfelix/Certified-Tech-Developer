package CheckpointII.POO;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

abstract class Consulta {
    private int idConsulta;
    private LocalDate dataConsulta;
    private String especialidade;
    private LocalTime horaEMinutoConsulta;

    public Consulta(int idConsulta, LocalDate dataConsulta, String especialidade, LocalTime horaEMinutoConsulta) {
        this.idConsulta = idConsulta;
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.horaEMinutoConsulta = horaEMinutoConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public LocalTime getHoraEMinutoConsulta() {
        return horaEMinutoConsulta;
    }

    public String efetuarAvaliacaoInicial(Paciente paciente) {
        if (paciente.isPrimeiraConsulta()) {
            paciente.setPrimeiraConsulta(false);
            return "Deve ser efetuado a avaliacao inicial";
        } else {
            return "Nao eh necessario a avaliacao inicial";
        }
    }
}