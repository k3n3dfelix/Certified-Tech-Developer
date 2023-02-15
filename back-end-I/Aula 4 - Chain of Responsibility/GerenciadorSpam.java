package aula4.chain.responsibility;

public class GerenciadorSpam extends Gerenciador{
    @Override
    public void verificar(Mail mail) {
        System.out.println("Enviado para a caixa de Spam");
    }
}
