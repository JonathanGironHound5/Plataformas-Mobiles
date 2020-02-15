package com.example.clase3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText nombre, dias, pagado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText)findViewById(R.id.etnombre);
        dias=(EditText)findViewById(R.id.etdias);
        pagado=(EditText)findViewById(R.id.etpagado);
    }
    public void calcularL(View v){
        String nombreE = nombre.getText().toString();
        String Tdias = dias.getText().toString();
        String Tpagado = pagado.getText().toString();
        double ndias = Double.parseDouble(Tdias);
        double npagado= Double.parseDouble(Tpagado);
        double op = ndias*npagado;
        String operacion = String.valueOf(op);
        double ret=0.10;
        String preten;
        double vr;
        String vreten;
        double vn;
        String vneto;

        if((op >=1500001 )&& (op<2500000)){
         preten = "10%";
         vr = (op*0.10);
         vreten=String.valueOf(vr);
         vn = (op-vr) ;
         vneto = String.valueOf(vn);
        alerta(nombreE+" \n"+"Número días :"+Tdias+" \n"+ "valor pagado por día :"+Tpagado+" \n"+"Valor bruto: "+operacion+" \n"
                +"Porcentaje: "+ preten+" \n"+"Valor retención: "+vreten+" \n"+"Valor neto: "+vneto);
        }
        if((op >=2500001 )&& (op<3500000)){
            preten = "20%";
            vr = (op*0.20);
            vreten=String.valueOf(vr);
            vn = (op-vr) ;
            vneto = String.valueOf(vn);
            alerta(nombreE+" \n"+"Número días :"+Tdias+" \n"+ "valor pagado por día :"+Tpagado+" \n"+"Valor bruto: "+operacion+" \n"
                    +"Porcentaje: "+ preten+" \n"+"Valor retención: "+vreten+" \n"+"Valor neto: "+vneto);
        }
        if((op >=2500001 )&& (op<4500000)){
            preten = "30%";
            vr = (op*0.30);
            vreten=String.valueOf(vr);
            vn = (op-vr) ;
            vneto = String.valueOf(vn);
            alerta(nombreE+" \n"+"Número días :"+Tdias+" \n"+ "valor pagado por día :"+Tpagado+" \n"+"Valor bruto: "+operacion+" \n"
                    +"Porcentaje: "+ preten+" \n"+"Valor retención: "+vreten+" \n"+"Valor neto: "+vneto);
        }
        if(op >=4500001 ){
            preten = "40%";
            vr = (op*0.40);
            vreten=String.valueOf(vr);
            vn = (op-vr) ;
            vneto = String.valueOf(vn);
            alerta(nombreE+" \n"+"Número días :"+Tdias+" \n"+ "valor pagado por día :"+Tpagado+" \n"+"Valor bruto: "+operacion+" \n"
                    +"Porcentaje: "+ preten+" \n"+"Valor retención: "+vreten+" \n"+"Valor neto: "+vneto);
        }

    }
    public void alerta(String cad){
        AlertDialog.Builder dialogB =new AlertDialog.Builder(this);
        dialogB.setMessage(cad);
        dialogB.setCancelable(true).setTitle("Querido usuario su liquidación es la siguiente: ");
        dialogB.create().show();
    }
}
