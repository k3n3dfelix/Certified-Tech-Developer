package com.dh.clinica.service;

import com.dh.clinica.dao.IDao;
import com.dh.clinica.model.Endereco;

import java.util.List;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco){
        enderecoIDao.salvar(endereco);
        return endereco;
    }

    public Endereco buscarPorId(int id){
        return enderecoIDao.buscarPorId(id);

    }
    public List<Endereco> buscarTodos() {
        return enderecoIDao.buscarTodos();
    }
}
