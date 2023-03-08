public class Dentista {
    private String nome;
    private String sobrenome;
    private static Long matricula;

    public Dentista(String nome, String sobrenome, Long matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public static Long getMatricula() {
        return matricula;
    }

    public static void setMatricula(Long matricula) {
        Dentista.matricula = matricula;
    }

    public Long setMatriculaTest(){
        Long cont = 1L;
        this.matricula = 1L;
        if(cont>1){
            return this.matricula = cont++;
        }
        return this.matricula;
    }
}
