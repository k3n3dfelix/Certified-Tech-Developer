package CheckpointII.POO;

public class PacientePublicoException extends Exception {
    public PacientePublicoException() {
        super("Consulta nao faz referĂȘncia a um paciente publico");
    }
}
