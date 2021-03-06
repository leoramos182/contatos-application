package com.example.contatosapplication.helper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class helperDb(
    context: Context
) : SQLiteOpenHelper(context, NOME_APP, null, VERSAO_ATUAL) {
    companion object {
        val NOME_APP = "CONTATOS_APP"
        val VERSAO_ATUAL = 1

        val TABLE_NAME = "contatos"
        val DROP_TABLE = "DROP TABLE IF EXISTS $NOME_APP"
    }
    override fun onCreate(p0: SQLiteDatabase?) {
    }

    override fun onUpgrade(db : SQLiteDatabase?, oldVersion : Int, newVersion : Int) {
        if(oldVersion != newVersion){
            db?.execSQL(DROP_TABLE)
        }
        onConfigure(db)
    }

}