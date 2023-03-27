package com.dh.Aula32Orm.controller;

import com.dh.Aula32Orm.model.Produto;
import com.dh.Aula32Orm.service.impl.ProdutoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoServiceImpl produtoService;

    public ProdutoController(ProdutoServiceImpl produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto){

        return ResponseEntity.ok(produtoService.salvar(produto));
    }

    @GetMapping
    public ResponseEntity <List<Produto>> buscarTodos() {
        return ResponseEntity.ok(produtoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity <Optional<Produto>> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(@PathVariable Long id){
        produtoService.excluir(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
