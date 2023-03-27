package com.dh.Aula32Orm.service.impl;

import com.dh.Aula32Orm.model.Produto;
import com.dh.Aula32Orm.repository.IProdutoRepository;
import com.dh.Aula32Orm.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl  implements IProdutoService {

    private IProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto salvar(Produto produto) {
        Produto p = produtoRepository.save(produto);

        return p;
    }

    @Override
    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public void excluir(Long id) {
        produtoRepository.deleteById(id);
    }
}
