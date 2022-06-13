package CheckpointI.POO.KenedFelix;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date dateFeiraAdocao = new Date();

        Voluntario voluntario1 = new Voluntario(1,"Bruno","Fernandes",true,4,dateFeiraAdocao);
        Voluntario voluntario2 = new Voluntario(1,"Mariana","Silva",true,3,dateFeiraAdocao);
        Voluntario voluntario3 = new Voluntario(1,"Ricardo","Silveira",true,5,dateFeiraAdocao);

        voluntario1.trabalhar(voluntario1);
        voluntario2.trabalhar(voluntario2);
        voluntario3.trabalhar(voluntario3);

        Date date = new Date();
        Adotante adotante = new Adotante(1,"Joao","Silva","Rua 2",125,"Residencial Palermo");
        Cachorro cachorro = new Cachorro(1,"Bidu",date,"bege","SRD","medio",10.5,42 );

        Adotante adotante2 = new Adotante(2,"Maria","Fernandes","Rua 2",7586,"Residencial Lima");
        Cachorro cachorro2 = new Cachorro(2,"Rex",date,"malhado","beagle","medio",7.5,42 );

        Adotante adotante3 = new Adotante(3,"Fabricio","Lima","Rua 3",7854,"Brasilandia");
        Cachorro cachorro3 = new Cachorro(3,"Belinha",date,"branco","dalmata","grande",20,42 );

        Adotante adotante4 = new Adotante(4,"Fabiana","Azevedo","Rua 4",7856,"Residencial Brasil");
        Cachorro gato = new Cachorro(1,"bichano",date,"mesclado","siames","medio",7.2,30);

        Adotante adotante5 = new Adotante(5,"Rosana","Bernardes","Rua 5",7421,"Aeroporto");
        Cachorro gato2 = new Cachorro(12,"Jagger",date,"bege","Persa","medio",5.7,27 );

        Adotante adotante6 = new Adotante(6,"Roberto","Costa","Rua 6",3687,"Jardim California");
        Cachorro gato3 = new Cachorro(3,"Bilbo",date,"branco","Angorá","pequeno",4,30 );

        Adocao adocao1 = new Adocao(adotante, cachorro);
        Adocao adocao2 = new Adocao(adotante2, cachorro2);
        Adocao adocao3 = new Adocao(adotante3, cachorro3);
        Adocao adocao4 = new Adocao(adotante4, gato);
        Adocao adocao5 = new Adocao(adotante3, gato2);
        Adocao adocao6 = new Adocao(adotante3, gato3);

        adocao1.adotarAnimal(adotante,cachorro);
        adocao2.adotarAnimal(adotante2,cachorro2);
        adocao3.adotarAnimal(adotante3,cachorro3);
        adocao4.adotarAnimal(adotante4,gato);
        adocao5.adotarAnimal(adotante5,gato2);
        adocao6.adotarAnimal(adotante6,gato3);
    }
}
