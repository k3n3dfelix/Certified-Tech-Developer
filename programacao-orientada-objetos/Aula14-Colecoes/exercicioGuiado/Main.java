package Aula14.Colecoes.exercicioGuiado;

public class Main {
    public static void main(String[] args) {
        Jogador joao = new Jogador("João",11);
        Jogador pedro = new Jogador("João",11);
        System.out.println(joao.getNome());

        Equipe equipe = new Equipe();

        equipe.addJogador(joao);
        System.out.println(joao.equals(pedro));
        System.out.println(equipe.getJogadores().get(0));
    }
}
