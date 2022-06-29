package Aula20.PadraoState;

public class Main {
    public static void main(String[] args) {
        // Estado Fome
        Tamagochi tamagochi = new Tamagochi();
        //Nada acontece
        tamagochi.carinho();
        // Estado Feliz
        tamagochi.come();
        // Nada muda
        tamagochi.carinho();
        // bip bip bip bip bip
        tamagochi.bebe();
    }


}
