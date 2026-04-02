package com.flavio.bancodedadossqlite.controller;

public interface ICrud<T> {

    public boolean incluir ( T obj);
    public boolean alterar ( T obj);
    public boolean listar  ( T obj);
    public boolean deletar ( T obj);


}
