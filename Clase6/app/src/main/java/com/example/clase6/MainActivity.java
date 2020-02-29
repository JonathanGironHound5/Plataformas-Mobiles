package com.example.clase6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etCedula, etMesa, etColegio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etCedula = (EditText)findViewById(R.id.etCedula);
        etMesa = (EditText)findViewById(R.id.etMesa);
        etColegio = (EditText)findViewById(R.id.etColegio);
    }

    public void insertar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null,1);
        SQLiteDatabase bd =  admin.getWritableDatabase();
        String Cedula = etCedula.getText().toString();
        String Nombre = etNombre.getText().toString();
        String colegio = etColegio.getText().toString();
        String mesa = etMesa.getText().toString();

        ContentValues registro = new ContentValues();
        registro.put("cedula",Cedula);
        registro.put("nombre",Nombre);
        registro.put("colegio",colegio);
        registro.put("nromesa",mesa);
        bd.insert("votantes",null,registro);
        bd.close();

        etNombre.setText("");
        etCedula.setText("");
        etColegio.setText("");
        etMesa.setText("");

        Toast.makeText(this ,"Se cargaron los datos de la persona ",Toast.LENGTH_SHORT).show();

    }
    public void consulta(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String Cedula = etCedula.getText().toString();
        Cursor fila = bd.rawQuery("select nombre,colegio,nromesa from votantes where cedula="+Cedula,null);
        if(fila.moveToFirst()){
            etNombre.setText(fila.getString(0));
            etColegio.setText(fila.getString(1));
            etMesa.setText(fila.getString(2));
        }else Toast.makeText(this,"No existe una persona con dihca cedula", Toast.LENGTH_SHORT).show();
        bd.close();
    }
    public void eliminar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String Cedula = etCedula.getText().toString();
        int cant = bd.delete("votantes","cedula="+ Cedula,null);
        bd.close();
        etNombre.setText("");
        etCedula.setText("");
        etMesa.setText("");
        etColegio.setText("");

        if(cant == 1)Toast.makeText(this,"se borró la persona con dicho documento",Toast.LENGTH_SHORT).show();
        else Toast.makeText(this,"No existe una persona con dicho documento",Toast.LENGTH_SHORT).show();
    }

    public void modificar(View view){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion",null,1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String Cedula = etCedula.getText().toString();
        String Nombre = etNombre.getText().toString();
        String colegio = etColegio.getText().toString();
        String mesa = etColegio.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("nombre",Nombre);
        registro.put("colegio",colegio);
        registro.put("nromesa", mesa);
        int cant = bd.update("votantes", registro,"cedula="+Cedula,null);
        bd.close();

        if(cant == 1)Toast.makeText(this,"Se modificaron los datos", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this,"no existe una persona con dicho documento", Toast.LENGTH_LONG).show();

    }

}
