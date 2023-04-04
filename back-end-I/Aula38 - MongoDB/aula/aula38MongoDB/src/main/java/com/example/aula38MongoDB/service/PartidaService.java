package com.example.aula38MongoDB.service;

import com.example.aula38MongoDB.model.Partida;
import com.example.aula38MongoDB.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PartidaService {

    @Autowired
    private PartidaRepository partidaRepository;

    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    public Partida cadastrar(Partida partida){
        return partidaRepository.save(partida);
    }

    public List<Partida> listar() {
        return partidaRepository.findAll();
    }
}
