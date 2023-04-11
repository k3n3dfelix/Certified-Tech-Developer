package com.dh.aulaseguranca.service;


import com.dh.aulaseguranca.model.Produto;
import com.dh.aulaseguranca.model.dto.ProdutoDTO;

import java.util.List;

public interface IProdutoService {

    ProdutoDTO salvar(Produto produto);
    List<ProdutoDTO> buscarTodos();
    ProdutoDTO buscarPorId(Long id);
    void excluir(Long id);

}
