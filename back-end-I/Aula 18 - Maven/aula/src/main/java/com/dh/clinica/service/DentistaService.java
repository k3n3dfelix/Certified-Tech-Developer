package com.dh.clinica.service;

import com.dh.clinica.dao.IDao;
import com.dh.clinica.model.Dentista;
import com.dh.clinica.model.Endereco;

import java.util.List;

public class DentistaService {

    private IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista salvar(Dentista dentista){
        dentistaIDao.salvar(dentista);
        return dentista;
    }

    public Dentista buscarPorId(int id){
        return dentistaIDao.buscarPorId(id);

    }
    public List<Dentista> buscarTodos() {
        return dentistaIDao.buscarTodos();
    }
}
