package com.flavio.bancodedadossqlite.datasouce;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.flavio.bancodedadossqlite.api.AppUtil;
import com.flavio.bancodedadossqlite.controller.ProdutoController;
import com.flavio.bancodedadossqlite.datamodel.ClienteDataModel;
import com.flavio.bancodedadossqlite.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "Loja.sqlite";

    public static int version = 1;

    SQLiteDatabase db;

    public AppDataBase( Context context) {
        super(context, DB_NAME, null, version);
        Log.i(AppUtil.TAG, "AppDataBase: Criando o banco");
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());
        db.execSQL(ProdutoDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
