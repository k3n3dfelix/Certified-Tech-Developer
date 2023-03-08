package com.dh.clinica.dao;

import java.util.List;

public interface IDao <Objeto>{

    public Objeto salvar(Objeto objeto);

    public List<Objeto> buscarTodos();

    void deletar(int id);

    Objeto buscarPorId(int id);
    public Objeto atualizar(Objeto objeto);
}
