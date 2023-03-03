package com.dh.service;

import com.dh.dao.IDao;
import com.dh.model.Medicamento;

public class MedicamentosService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentosService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento salvarMedicamento(Medicamento medicamento){
        return medicamentoIDao.salvar(medicamento);
    }
}
