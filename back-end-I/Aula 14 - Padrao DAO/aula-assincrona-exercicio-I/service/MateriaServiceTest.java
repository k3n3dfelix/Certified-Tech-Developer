package test.com.dh.materias.service;

import com.dao.materias.dao.ConfiguracaoJDBC;
import com.dao.materias.dao.impl.MateriaDaoH2;
import com.dao.materias.model.Materia;
import com.dao.materias.service.MateriaService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MateriaServiceTest {

    private MateriaService materiaService = new MateriaService(new MateriaDaoH2(new ConfiguracaoJDBC()));

    @Test
    public void salvarMAteriaTest() {
        Materia materia = new Materia("Back-End");

        Materia materiaRegistrada = materiaService.salvar(materia);

        assertTrue(materiaRegistrada.getId() != null);
    }

    @Test
    public void buscarTodosTest() {
        Materia materia = new Materia("Back-End");

       materiaService.salvar(materia);

        List<Materia> materias = materiaService.buscarTodos();

        assertEquals(1, materias.size());
    }


}
