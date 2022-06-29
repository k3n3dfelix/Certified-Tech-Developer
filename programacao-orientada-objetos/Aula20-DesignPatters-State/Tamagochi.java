package Aula20.PadraoState;

public class Tamagochi {

    private Estado estado;

    public Tamagochi(){
       setEstado(new Fome(this));
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public void come() {
        estado.comer();
    }

    public void bebe() {
        estado.beber();
    }

    public void carinho() {
        estado.carinho();
    }
}
