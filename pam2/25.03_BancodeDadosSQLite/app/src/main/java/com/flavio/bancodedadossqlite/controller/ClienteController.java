package com.flavio.bancodedadossqlite.controller;

import android.content.Context;
import android.util.Log;

import com.flavio.bancodedadossqlite.api.AppUtil;
import com.flavio.bancodedadossqlite.datasouce.AppDataBase;

public class ClienteController extends AppDataBase {
    public ClienteController(Context context) {
        super(context);

        Log.i(AppUtil.TAG, "CreateController: Conectado ao banco ");

    }
}
