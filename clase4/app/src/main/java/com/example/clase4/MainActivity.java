package com.example.clase4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText campoNombre, campoApellidos;
    private Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNombre = (EditText)findViewById(R.id.etnombre);
        campoApellidos=(EditText)findViewById(R.id.etapellido);
        miBoton=(Button)findViewById(R.id.bpasar);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("nombre", campoNombre.getText()+"");
                i.putExtra("apellidos",campoApellidos.getText()+"");
                startActivity(i);
            }
        });
    }
}
