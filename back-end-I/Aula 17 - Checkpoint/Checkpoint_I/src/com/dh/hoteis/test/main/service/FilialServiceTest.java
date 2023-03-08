package com.dh.hoteis.test.main.service;

import com.dh.hoteis.config.ConfiguracaoJDBC;
import com.dh.hoteis.dao.impl.FilialDao;
import com.dh.hoteis.model.Filial;
import com.dh.hoteis.service.FilialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilialServiceTest {

    FilialService filialService;

    @BeforeEach
    void doBefore(){
        filialService = new FilialService(new FilialDao(new ConfiguracaoJDBC()));
    }

    @Test
    public void salvarFilial(){
        Filial f1 = new Filial("Monreale - DF","R. Matuzinho",395,"Distrito Federal", "DF", true);
        filialService.salvar(f1);
        assertTrue(f1.getId()!= null);

        Filial f2 = new Filial("Monreale - SP","R. Francisco Marques",1200,"Franca", "SP", false);
        filialService.salvar(f2);
        assertTrue(f2.getId()!= null);

        Filial f3 = new Filial("Monreale - BH","R. Quatorze",858,"BH", "MG", true);
        filialService.salvar(f3);
        assertTrue(f1.getId()!= null);

        Filial f4 = new Filial("Monreale - SP","R. Liberdade",124,"Sao Paulo", "SP", false);
        filialService.salvar(f4);
        assertTrue(f2.getId()!= null);

        Filial f5 = new Filial("Monreale - RJ","R. Brilhante Lima",896,"Rio de Janeiro", "RJ", true);
        filialService.salvar(f5);
        assertTrue(f1.getId()!= null);


    }
}
