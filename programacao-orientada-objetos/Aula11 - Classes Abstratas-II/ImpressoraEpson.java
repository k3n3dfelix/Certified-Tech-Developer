package aula11.ClassesAbsract;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{

    public ImpressoraEpson(String modelo, String tipoconexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoconexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir(){
        return "Imprimiu da Epson";
    }
}
