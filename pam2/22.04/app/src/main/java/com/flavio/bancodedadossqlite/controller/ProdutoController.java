package com.flavio.bancodedadossqlite.controller;

import android.content.Context;
import android.util.Log;

import com.flavio.bancodedadossqlite.api.AppUtil;
import com.flavio.bancodedadossqlite.datasouce.AppDataBase;
import com.flavio.bancodedadossqlite.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    public ProdutoController (Context context) {
        super(context);
        Log.i(AppUtil.TAG, "ProdutoController: Conectado ao banco");

    }

    @Override
    public boolean incluir(Produto obj) {
        return false;
    }

    @Override
    public boolean alterar(Produto obj) {
        return false;
    }

    @Override
    public boolean listar(Produto obj) {
        return false;
    }

    @Override
    public boolean deletar(Produto obj) {
        return false;
    }
}
