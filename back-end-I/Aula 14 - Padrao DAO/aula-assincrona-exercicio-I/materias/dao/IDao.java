package com.dao.materias.dao;

import java.util.List;

public interface IDao <T>{

    public T salvar(T t);
    public List<T> buscarTodos();
}
