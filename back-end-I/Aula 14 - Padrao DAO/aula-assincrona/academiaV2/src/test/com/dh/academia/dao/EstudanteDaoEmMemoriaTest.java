package test.com.dh.academia.dao;

import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.dao.impl.EstudanteDaoEmMemoria;
import main.com.dh.academia.model.Estudante;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EstudanteDaoEmMemoriaTest {
    private IDao<Estudante> estudanteDao = new EstudanteDaoEmMemoria(new ArrayList());

    @Before
    public void cargarEstudiantes() {
        estudanteDao.salvar(new Estudante("1", "EstudanteUm", "SobrenomeUm"));
        estudanteDao.salvar(new Estudante("2", "EstudanteDois", "SobrenomeDois"));
        estudanteDao.salvar(new Estudante("3", "EstudanteTrês", "SobrenomeTrês"));
        estudanteDao.salvar(new Estudante("4", "EstudanteQuatro", "SobrenomeQuatro"));
    }

    @Test
    public void salvarEBuscarEstudantesTest() {

        estudanteDao.salvar(new Estudante("5", "Carlos", "Pereira"));
        Estudante estudante = estudanteDao.buscar("5");
        Assert.assertNotNull(estudante);
        Assert.assertEquals(estudante.getNome(), "Carlos");

    }

    @Test
    public void buscarTodosOsEstudantesTest() {
        List<Estudante> estudantes = estudanteDao.buscarTodos();
        Assert.assertEquals(estudantes.size(), 4);
    }
    @Test
    public void eliminarEstudanteTest() {
        estudanteDao.eliminar("1");
        Assert.assertEquals(estudanteDao.buscar("1"),null);


    }
}
