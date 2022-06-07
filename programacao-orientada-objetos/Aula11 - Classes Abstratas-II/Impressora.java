package aula11.ClassesAbsract;

import java.time.LocalDate;
import java.util.Locale;

abstract class Impressora {
    private String modelo;
    private String tipoconexao;
    private LocalDate dataFabricacao;



    private int folhasDisponiveis;
    private double porcentagemTinta;

    public Impressora(String modelo, String tipoconexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        this.modelo = modelo;
        this.tipoconexao = tipoconexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcentagemTinta = porcentagemTinta;
    }


    public boolean temPapel(){
        return folhasDisponiveis > 0;
    }

    public boolean precisaDeTinta(){
        return porcentagemTinta > 0.1;
    }

    public abstract String imprimir();

}
