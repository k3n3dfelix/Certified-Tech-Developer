package aula4.chain.responsibility;

public class GerenciadorComercial extends Gerenciador{


    @Override
    public void verificar(Mail mail) {
        if((mail.getDestino().equalsIgnoreCase("comercial@colmeia.com")) ||
                (mail.getAssunto().equalsIgnoreCase("Comercial"))){
            System.out.println("Enviado ao departamento comercial");
        } else {
            if(this.getGerenciadorSeguinte() != null){
                this.getGerenciadorSeguinte().verificar(mail);
            }
        }
    }
}
