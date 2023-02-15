package aula4.chain.responsibility;

public class CheckMail {

    Gerenciador inicial;

    public CheckMail() {
        inicial = new GerenciadorGerencia();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnico);
        tecnico.setGerenciadorSeguinte(spam);
    }
    public void verificador(Mail mail){
        inicial.verificar(mail);
    }
}
