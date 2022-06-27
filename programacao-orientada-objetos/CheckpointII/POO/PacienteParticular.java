package CheckpointII.POO;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class PacienteParticular extends Paciente implements AdicionarConsulta {
    private String rg;
    private Set<ConsultaParticular> consultas;

    public PacienteParticular(String nome, String sobrenome, LocalDate dataNascimento, String rg) {
        super(nome, sobrenome, dataNascimento);
        this.consultas = new TreeSet<>();
        this.rg = rg;
    }

    @Override
    public void addConsulta(Consulta consulta) throws PacienteParticularException  {
        if (consulta instanceof ConsultaParticular) {
            consultas.add((ConsultaParticular) consulta);
        } else {
            throw new PacienteParticularException();
        }
    }
}