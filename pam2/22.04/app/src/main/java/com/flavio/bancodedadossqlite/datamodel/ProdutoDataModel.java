package com.flavio.bancodedadossqlite.datamodel;

import android.util.Log;

import com.flavio.bancodedadossqlite.api.AppUtil;

public class ProdutoDataModel {

    public static final String TABELA = "Produto";

    //passo 2 - atributos da tabela
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String FORNECEDOR = "fornecedor";

    //passo 3 - query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    //passo 4 - metodo para gerar o script de criação da tabela

    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE IF NOT EXISTS " + TABELA + "(";
        queryCriarTabela += ID    + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += NOME  + " TEXT, ";
        queryCriarTabela += FORNECEDOR + " TEXT";
        queryCriarTabela += ");";

        Log.i(AppUtil.TAG, "ProdutoDataModel: " + queryCriarTabela);

        return queryCriarTabela;
    }
}
