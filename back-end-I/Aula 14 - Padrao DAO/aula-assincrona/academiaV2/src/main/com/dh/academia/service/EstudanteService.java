package main.com.dh.academia.service;

import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.model.Estudante;

import java.util.List;

public class EstudanteService {

    private IDao<Estudante> estudanteDao;

    public EstudanteService() {

    }

    public EstudanteService(IDao<Estudante> estudanteDao) {
        this.estudanteDao = estudanteDao;
    }

    public void setEstudanteDao( IDao<Estudante> estudanteDao) {
        this.estudanteDao = estudanteDao;
    }

    public Estudante salvarEstudante(Estudante estudante){
        estudanteDao.salvar(estudante);
        return estudante;
    }
    public List<Estudante> buscarTodos(){
        return estudanteDao.buscarTodos();
    }

    public Estudante buscar(String id){
        return estudanteDao.buscar(id);
    }

}
