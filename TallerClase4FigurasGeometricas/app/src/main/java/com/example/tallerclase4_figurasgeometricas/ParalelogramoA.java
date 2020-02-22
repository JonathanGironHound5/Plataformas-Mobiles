package com.example.tallerclase4_figurasgeometricas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ParalelogramoA extends AppCompatActivity {

    private EditText Altura,Base;
    private Button Calcular, Regresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paralelogramo);

        Altura = (EditText)findViewById(R.id.etAlturaP);
        Base = (EditText)findViewById(R.id.etBaseP);
        Calcular = (Button)findViewById(R.id.bAreaP);
        Regresar = (Button) findViewById(R.id.bBack);


    }
    public void CalcularAreaP(View view){
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
        dialogBuilder.setCancelable(true).setTitle("El área del Paralelogramo es: ");
        dialogBuilder.create().show();
    }
    public void RegresarP(View view){
        Intent i = new Intent(ParalelogramoA.this,MainActivity.class);
        startActivity(i);
    }
}
