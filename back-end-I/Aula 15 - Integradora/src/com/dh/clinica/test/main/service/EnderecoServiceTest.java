package com.dh.clinica.test.main.service;

import com.dh.clinica.dao.ConfiguracaoJDBC;
import com.dh.clinica.dao.impl.EnderecoDao;
import com.dh.clinica.model.Endereco;
import com.dh.clinica.service.EnderecoService;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EnderecoServiceTest {

    private EnderecoService enderecoService = new EnderecoService(new EnderecoDao());

    @Test
    public void salvarEnderecoTest() {
        Endereco endereco = new Endereco("Rua 2","120","Bairro", "Cidade" );

        Endereco enderecoRegistrado = enderecoService.salvar(endereco);

        assertTrue(enderecoRegistrado.getId() != 0);
    }

    @Test
    public void buscarEnderecosTest() {
        Endereco endereco1 = new Endereco("Rua 2","120","Bairro", "Cidade" );

        List<Endereco> enderecos = enderecoService.buscarTodos();

        for(Endereco endereco : enderecos) {
            System.out.println("Rua" + endereco.getRua());
        }
        assertTrue(enderecos.size() > 0);
    }
}
