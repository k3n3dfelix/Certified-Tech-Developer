package CheckpointII.POO;

public class PacientePublicoException extends Exception {
    public PacientePublicoException() {
        super("Consulta nao faz referência a um paciente publico");
    }
}
