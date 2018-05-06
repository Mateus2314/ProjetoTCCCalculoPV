package com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.config;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.dao.InversorDao;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.dao.UsuarioDao;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.schemas.InversorSchemas;
import com.projetocpv.example.mateus2314.projetotcc_calculopv.activities.database.config.schemas.UsuarioSchema;

/**
 * Classe de configuração SQLite
 */

public class Database {
    private static final String DB_NAME = "my_database.bd";
    private static final int DB_VERSION = 1;
    private DatabaseHelper mDbHelper;
    private final Context context;
    private SQLiteDatabase db;
    public static UsuarioDao usuarioDao;
    public static InversorDao inversorDao;

    public Database(Context context) {
        this.context = context;
    }

    /* Abre a conexao com o SQLite */
    public Database open() throws SQLException {
        mDbHelper = new DatabaseHelper(context);
        db = mDbHelper.getWritableDatabase();
        usuarioDao = new UsuarioDao(db);
        inversorDao = new InversorDao(db);
        return this;
    }

    /* Fecha a conexao com o SQLite */
    public void close() {
        mDbHelper.close();
    }

    /**
     * Classe de configuracao do SQLite
     */
    private static class DatabaseHelper extends SQLiteOpenHelper {

        DatabaseHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        /* Realiza a criacao do banco de dados e as tabelas */
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(UsuarioSchema.CREATE_TABLE);
            db.execSQL(InversorSchemas.CREATE_TABLE);
        }

        /* Executado somente se a versao do banco de dados mudar */
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + UsuarioSchema.TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS " + InversorSchemas.TABLE_INVERSOR);
            onCreate(db);
        }
    }

}
