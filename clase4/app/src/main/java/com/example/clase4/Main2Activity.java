package com.example.clase4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView textNombre, textApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textNombre = (TextView) findViewById(R.id.tvnombre);
        textApellido = (TextView) findViewById(R.id.tvapellidos);

        String nombre = getIntent().getStringExtra("nombre");
        String apellidos = getIntent().getStringExtra("apellidos");

        textNombre.setText(nombre);
        textApellido.setText(apellidos);
    }
}
