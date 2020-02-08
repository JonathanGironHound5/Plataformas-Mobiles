package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private RadioButton rb1,rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
    }

    public void calcular(View view){
        String valor1 =et1.getText().toString();
        String valor2 = et2.getText().toString();
        int no1 = Integer.parseInt(valor1);
        int no2 = Integer.parseInt(valor2);

        if(rb1.isChecked()==true){
            int suma = no1+no2;
            String resu = String.valueOf(suma);
            tv3.setText(resu);
        }else
            if(rb2.isChecked()==true){
                int resta = no1-no2;
                String resu=String.valueOf(resta);
                tv3.setText(resu);
            }

    }
}
