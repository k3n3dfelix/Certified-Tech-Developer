package CheckpointII.POO;

public class PacienteParticularException extends Exception {
    public PacienteParticularException() {
        super("Consulta nao faz referĂȘncia a um paciente particular");
    }
}
