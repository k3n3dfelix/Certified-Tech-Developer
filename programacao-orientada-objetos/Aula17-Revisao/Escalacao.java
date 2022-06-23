package Aula17.Revisao;

enum Escalacao {
    TITULAR("Titular"),
    RESERVA("Reserva"),
    SUPLENTE("Suplente");

    private String descricao;

    Escalacao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
