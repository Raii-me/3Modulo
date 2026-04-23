package com.flavio.bancodedadossqlite.controller;

import android.content.Context;
import android.util.Log;

import com.flavio.bancodedadossqlite.api.AppUtil;
import com.flavio.bancodedadossqlite.datasouce.AppDataBase;
import com.flavio.bancodedadossqlite.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud <Cliente> {
    public ClienteController(Context context) {
        super(context);

        Log.i(AppUtil.TAG, "CreateController: Conectado ao banco ");

    }

    @Override
    public boolean incluir(Cliente obj) {
        return false;
    }

    @Override
    public boolean alterar(Cliente obj) {
        return false;
    }

    @Override
    public boolean listar(Cliente obj) {
        return false;
    }

    @Override
    public boolean deletar(Cliente obj) {
        return false;
    }
}
