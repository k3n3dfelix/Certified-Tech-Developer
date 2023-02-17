package aula5.proxy;

import java.time.LocalDate;

public interface IVacinar {

    void vacinarPessoa(String rg, LocalDate dataVacina, String tipoVacina, LocalDate dataAgendada);
}
