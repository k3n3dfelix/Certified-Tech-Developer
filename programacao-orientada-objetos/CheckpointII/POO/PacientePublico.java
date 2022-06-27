package CheckpointII.POO;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class PacientePublico extends Paciente implements AdicionarConsulta {
    private String carteirinhaSUS;
    private Set<ConsultaPublica> consultas;
    public PacientePublico(String nome, String sobrenome, LocalDate dataNascimento, String carteirinhaSUS) {
        super(nome, sobrenome, dataNascimento);
        this.consultas = new TreeSet<>();
        this.carteirinhaSUS = carteirinhaSUS;
    }

    @Override
    public void addConsulta(Consulta consulta) throws PacientePublicoException {
        if (consulta instanceof ConsultaPublica) {
            consultas.add((ConsultaPublica) consulta);
        } else {
            throw new PacientePublicoException();
        }
    }
    Set<ConsultaPublica> mostrarConsultasOrdenadas() {
        return consultas;
    }
}
