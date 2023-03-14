package com.dg.veiculo.service.impl;

import com.dg.veiculo.model.Veiculo;
import com.dg.veiculo.service.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Override
    public List<Veiculo> listVeiculo() {
        return Arrays.asList(new Veiculo("Chevrolet", "Preto"), new Veiculo("Fiat", "Azul"));
    }
}
