package com.example.tallerclase4_figurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button triangulo, paralelogramo, rectangulo, trapecio, hexagono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        triangulo = (Button) findViewById(R.id.Btriangulo);
        paralelogramo = (Button) findViewById(R.id.Bparlelogramo);
        rectangulo = (Button) findViewById(R.id.Brectangulo);
        trapecio = (Button) findViewById(R.id.Btrapecio);
        hexagono = (Button) findViewById(R.id.Bhexagono);

    }

    public void addParalelogramo(View view) {
        Intent i = new Intent(MainActivity.this, ParalelogramoA.class);
        startActivity(i);
    }

    public void addRectangulo(View view) {
        Intent i = new Intent(MainActivity.this, rectanguloA.class);
        startActivity(i);

    }
}