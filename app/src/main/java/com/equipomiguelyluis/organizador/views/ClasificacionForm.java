package com.equipomiguelyluis.organizador.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.equipomiguelyluis.organizador.R;

public class ClasificacionForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion_form);
        setTitle("Nueva Clasificación");
    }

    public void createForm(View view){
        TextView nombre =  (TextView) findViewById(R.id.classificacionName);
        String val = nombre.getText().toString();
        if(val == null || !val.equals("")){
             Toast.makeText(this, "Clasificacion no valida", Toast.LENGTH_SHORT).show();
        }
        else{

        }
    }
}