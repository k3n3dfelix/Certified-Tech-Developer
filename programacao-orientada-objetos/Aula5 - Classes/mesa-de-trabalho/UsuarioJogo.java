package aula5.mesa;

public class UsuarioJogo {


    private String nome;
    private String nickname;
    private Integer pontuacao = 0;
    private Integer nivel = 0;

    private Integer bonus = 0;

    public UsuarioJogo(String nome, String nickname, Integer pontuacao, Integer nivel) {
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = pontuacao = 0;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void aumentarPontuacao(){
         this.pontuacao += 1;
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public void bonus(){
        this.bonus += 2;
    }



}
