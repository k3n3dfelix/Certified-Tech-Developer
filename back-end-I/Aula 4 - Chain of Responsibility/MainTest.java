package aula4.chain.responsibility;

public class MainTest {
    public static void main(String[] args) {
        CheckMail processa = new CheckMail();
        processa.verificador(new Mail("email@email.com", "tecnica@digitalhouse.com", "Aula4"));
        processa.verificador(new Mail("email@email.com", "sds@digitalhouse.com", "Gerência"));
        processa.verificador(new Mail("email@email.com", "tassistencia@digitalhouse.com", "Comercial"));
        processa.verificador(new Mail("email@email.com", "tecnico@colmeia.com", "Aula4"));
    }
}
