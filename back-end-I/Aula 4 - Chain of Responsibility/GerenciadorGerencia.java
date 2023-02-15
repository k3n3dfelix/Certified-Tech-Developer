package aula4.chain.responsibility;

public class GerenciadorGerencia extends Gerenciador{
    @Override
    public void verificar(Mail mail) {
        if((mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Gerência"))){
            System.out.println("Enviado ao departamento gerencial");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}
