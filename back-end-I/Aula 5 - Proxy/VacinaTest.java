package aula5.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VacinaTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Test
    @DisplayName("Deve vacinar")
    void vacinarNaMesmaDataMarcada(){
        LocalDate dataAplicacao = LocalDate.parse("16/02/2023", formatter);
        LocalDate dataMarcado = LocalDate.parse("16/02/2023", formatter);;
        Pessoa p1 = new Pessoa("Jorge","Lucas", "123456789", dataAplicacao,dataMarcado, "Pfizer");

        ServicoVacinarProxy vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
    }

    @Test
    @DisplayName("Não Deve vacinar")
    void vacinarNEmDataPosteriorDataMarcada(){
        LocalDate dataAplicacao = LocalDate.parse("16/02/2023", formatter);
        LocalDate dataMarcado = LocalDate.parse("10/02/2023", formatter);;
        Pessoa p1 = new Pessoa("Jorge","Lucas", "123456789", dataAplicacao,dataMarcado, "Pfizer");

        ServicoVacinarProxy vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
    }

    @Test
    @DisplayName("Deve vacinar")
    void vacinarNaDataDiferenteDataMarcada(){
        LocalDate dataAplicacao = LocalDate.parse("10/02/2023", formatter);
        LocalDate dataMarcado = LocalDate.parse("16/02/2023", formatter);
        Pessoa p1 = new Pessoa("Jorge","Lucas", "123456789", dataAplicacao,dataMarcado, "Pfizer");

        ServicoVacinarProxy vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataAplicacao(), p1.getNomeVacina(), p1.getDataAgendada());
    }

}
