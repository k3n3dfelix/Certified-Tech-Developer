package CheckpointII.POO;

public class PacienteParticularException extends Exception {
    public PacienteParticularException() {
        super("Consulta nao faz referência a um paciente particular");
    }
}
