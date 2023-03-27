package com.dh.Aula32Orm.service;

import com.dh.Aula32Orm.model.Produto;

import java.util.List;
import java.util.Optional;

public interface IProdutoService {

    Produto salvar(Produto produto);

    List<Produto> buscarTodos();

    Optional<Produto> buscarPorId(Long id);

    void excluir (Long id);


}
