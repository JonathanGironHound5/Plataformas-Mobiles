package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.max;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv2,tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);

    }

    public void calcular(View view){
    String valor1 =et1.getText().toString();
    String valor2 =et2.getText().toString();
    double no1 = Double.parseDouble(valor1);
    double no2 = Double.parseDouble(valor2);
    double imc = no1/(no2*no2);
    String resuc=String.valueOf(imc);
    tv2.setText(resuc);

    if(imc<=18.5){
        tv3.setText("La persona tiene desnutrición");
    }else
        if (imc>=18.5 && imc<25){
            tv3.setText("La persona tiene bajo peso");
        }else
            if(imc>=25 && imc<30){
                tv3.setText("La persona tiene peso normal");
            } else
                if(imc>=30 && imc<40){
                    tv3.setText("La persona tiene problemas de obesidad");
                }else
                    if(imc>=40){
                        tv3.setText("La persona tiene obesidad severa");
                    }

    }
}
