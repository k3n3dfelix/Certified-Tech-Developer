package aula8.facade.mesa.model;

import java.util.Date;

public class Voo {

    private Date partida;
    private Date retorno;
    private String cidade_origem;
    private String cidade_destino;

    public Voo(Date partida, Date retorno, String cidade_origem, String cidade_destino) {
        this.partida = partida;
        this.retorno = retorno;
        this.cidade_origem = cidade_origem;
        this.cidade_destino = cidade_destino;
    }

    public Date getPartida() {
        return partida;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public Date getRetorno() {
        return retorno;
    }

    public void setRetorno(Date retorno) {
        this.retorno = retorno;
    }

    public String getCidade_origem() {
        return cidade_origem;
    }

    public void setCidade_origem(String cidade_origem) {
        this.cidade_origem = cidade_origem;
    }

    public String getCidade_destino() {
        return cidade_destino;
    }

    public void setCidade_destino(String cidade_destino) {
        this.cidade_destino = cidade_destino;
    }
}
