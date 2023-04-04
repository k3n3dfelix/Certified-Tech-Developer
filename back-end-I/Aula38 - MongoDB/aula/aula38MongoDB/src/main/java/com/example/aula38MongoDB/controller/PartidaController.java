package com.example.aula38MongoDB.controller;

import com.example.aula38MongoDB.model.Partida;
import com.example.aula38MongoDB.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    @Autowired
    private PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @PostMapping
    public Partida cadastrar(@RequestBody Partida partida){
        return partidaService.cadastrar(partida);
    }

    @GetMapping
    public List<Partida> listar() {
        return partidaService.listar();
    }

}
