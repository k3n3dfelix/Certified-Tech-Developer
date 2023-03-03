package test.com.dh.service;

import com.dh.config.ConfiguracaoJDBC;
import com.dh.dao.impl.MedicamentoDao;
import com.dh.model.Medicamento;
import com.dh.service.MedicamentosService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedicamentoServiceTest {

    public MedicamentosService medicamentoService = new MedicamentosService(new MedicamentoDao(new ConfiguracaoJDBC()));

    @Test
    void deveSalvarMedicamento() {
        Medicamento medicamento = new Medicamento("Ibuprofeno", "AChe", 300, 15.0);
        medicamentoService.salvarMedicamento(medicamento);
        Assertions.assertNotNull(medicamento.getId());
    }

}
