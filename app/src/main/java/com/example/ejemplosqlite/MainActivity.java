package com.example.ejemplosqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et_cedula, et_nombre, et_apellido, et_direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_cedula=findViewById(R.id.txt_cedula);
        et_nombre=findViewById(R.id.txt_nombre);
        et_apellido=findViewById(R.id.txt_apellido);
        et_direccion=findViewById(R.id.txt_direccion);
    }


}