package com.example.tallerclase4_figurasgeometricas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;

public class rectanguloA extends AppCompatActivity {


    private EditText Altura, Base;
    private Button Calcular, Regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        Altura = (EditText) findViewById(R. id. etAlturaR);
        Base = (EditText) findViewById(R. id. etBaseR);
        Calcular = (Button) findViewById(R. id. bAreaR);
        Regresar = (Button) findViewById(R. id. bBack2);

    }
    public void CalcularAreaR(View view){
        String altura = Altura.getText().toString();
        Double h = Double.parseDouble(altura);
        String base = Base.getText().toString();
        Double b = Double.parseDouble(base);

        double op = h*b;
        String operacion = String.valueOf(op);

        alerta(operacion);

    }
    public void alerta(String cadena){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setMessage(cadena);
        dialogBuilder.setCancelable(true).setTitle("El área del Rectangulo es: ");
        dialogBuilder.create().show();
    }
    public void RegresarR(View view){
        Intent i = new Intent(rectanguloA.this,MainActivity.class);
        startActivity(i);
    }
}
