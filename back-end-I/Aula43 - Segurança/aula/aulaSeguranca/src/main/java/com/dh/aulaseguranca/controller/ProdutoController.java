package com.dh.aulaseguranca.controller;

import com.dh.aulaseguranca.exception.InvalidDataException;
import com.dh.aulaseguranca.exception.ResourceNotFoundException;
import com.dh.aulaseguranca.model.dto.ProdutoDTO;
import com.dh.aulaseguranca.service.impl.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDTO> cadastrar(@RequestBody ProdutoDTO produtoDTO) throws InvalidDataException {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.salvar(produtoDTO));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> buscarTodos() throws ResourceNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> buscarPorId(@PathVariable Long id) throws ResourceNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id) throws ResourceNotFoundException {
        produtoService.excluir(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
