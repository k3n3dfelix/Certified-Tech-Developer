package aula5.mesa;

public class Usuario {
    public static void main(String[] args) {

        UsuarioJogo usuario1 = new UsuarioJogo("Kened", "k3n3d",0,0);
        UsuarioJogo usuario2 = new UsuarioJogo("João", "Jão",0,0);

        System.out.println("Pontuação usuario 1 = "+ usuario1.getPontuacao());
        System.out.println("Pontuação usuario 2 = "+ usuario2.getPontuacao());

        usuario1.aumentarPontuacao();
        usuario2.aumentarPontuacao();
        System.out.println("Pontuação usuario 1 = "+ usuario1.getPontuacao());
        System.out.println("Pontuação usuario 2 = "+ usuario2.getPontuacao());

        usuario1.subirNivel();
        usuario2.subirNivel();
        usuario2.subirNivel();
        System.out.println("Nivel usuario 1 = "+ usuario1.getNivel());
        System.out.println("Nivel usuario 2 = "+ usuario2.getNivel());

        usuario1.bonus();
        usuario2.bonus();
        System.out.println("Bonus usuario 1 = "+ usuario1.getBonus());
        System.out.println("Bonus usuario 2 = "+ usuario2.getBonus());





    }

}
