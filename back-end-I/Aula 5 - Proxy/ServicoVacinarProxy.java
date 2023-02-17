package aula5.proxy;

import java.time.LocalDate;

public class ServicoVacinarProxy implements IVacinar{

    @Override
    public void vacinarPessoa(String rg, LocalDate dataVacina, String tipoVacina, LocalDate dataAgendada) {
        if(dataVacina.isEqual(dataAgendada) || dataVacina.isAfter(dataAgendada)){
            ServicoVacinar vacinar = new ServicoVacinar();
            vacinar.vacinarPessoa(rg,dataVacina,tipoVacina,dataAgendada);
        }else{
            System.out.println("A data de aplicação: " +dataVacina+ "é anterior a data marcada: "+dataAgendada);
        }
    }
}
