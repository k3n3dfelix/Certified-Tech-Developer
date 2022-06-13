package CheckpointI.POO.KenedFelix;

public class Adocao {


    private Pessoa pessoa;
    private Animal animal;

    public Adocao(Pessoa pessoa, Animal animal) {
        this.pessoa = pessoa;
        this.animal = animal;
    }



    public void adotarAnimal( Pessoa pessoa, Animal animal){
        System.out.println("Animal: " + animal.getNome() +  " foi adotado por: " + pessoa.getNome());
    }

}
