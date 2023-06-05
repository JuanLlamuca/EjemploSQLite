package com.example.ejemplosqlite.bddSQLite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.ejemplosqlite.R;

public class BddSQLite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdd_sqlite);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table tblUsuarios" +"("+
                "usu_cedula INTEGER PRIMARY KEY ,"+
                "usu_nombre text NOT NULL,"+
                "usu_apellido txt not null, "+
                "usu_direccion txt not null)");
                );
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE tblUsuarios");
        onCreate(db);
    }
}