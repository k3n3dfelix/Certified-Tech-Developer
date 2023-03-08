package com.dh.hoteis.service;

import com.dh.hoteis.dao.IDao;
import com.dh.hoteis.model.Filial;

public class FilialService {

    private IDao<Filial> filialIDao;

    public FilialService(IDao<Filial> filialIDao) {
        this.filialIDao = filialIDao;
    }

    public Filial salvar(Filial filial) {
        return filialIDao.salvar(filial);
    }
}
