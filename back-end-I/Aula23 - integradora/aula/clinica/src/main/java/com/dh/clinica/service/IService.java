package com.dh.clinica.service;

import java.util.List;

public interface IService <Objeto>{

    Objeto salvar(Objeto objeto);

    List<Objeto> buscarTodos();

    void excluir(Integer id);
}
