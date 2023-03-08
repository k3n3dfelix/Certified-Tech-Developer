package com.dh.clinica.service;

import com.dh.clinica.dao.impl.DentistaDao;
import com.dh.clinica.dao.impl.EnderecoDao;
import com.dh.clinica.model.Dentista;
import com.dh.clinica.model.Endereco;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DentistaServiceTest {

    private DentistaService dentistaService = new DentistaService(new DentistaDao());

    @Test
    public void salvarDentistaTest() {
        Dentista dentista = new Dentista("Rosa","Oliveira","12316546546" );

        Dentista dentistaRegistrado = dentistaService.salvar(dentista);

        assertTrue(dentistaRegistrado.getId() != 0);
    }

    @Test
    public void buscarDentistaTest() {
        Dentista dentista1 = new Dentista("Rafael","120","Bairro" );

        List<Dentista> dentistas = dentistaService.buscarTodos();

        for(Dentista dentista : dentistas) {
            System.out.println("Dentista: " + dentista.getNome());
        }
        assertTrue(dentistas.size() > 0);
    }
}
