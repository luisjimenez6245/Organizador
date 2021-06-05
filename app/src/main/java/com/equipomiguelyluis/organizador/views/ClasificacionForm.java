package com.equipomiguelyluis.organizador.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.equipomiguelyluis.organizador.R;
import com.equipomiguelyluis.organizador.models.Classificacion;
import com.equipomiguelyluis.organizador.source.views.ClasificacionView;

import static com.equipomiguelyluis.organizador.source.Source.dbInstance;

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
        System.out.println(val);
        if(val == null || val.equals("")){
            Toast.makeText(this, "Clasificacion no valida", Toast.LENGTH_SHORT).show();
        }
        else{
            Classificacion cal = new Classificacion(val);
            System.out.println(val);
            new ClasificacionView().insert(new com.equipomiguelyluis.organizador.source.views.View.insertCallback() {
                @Override
                public Object onSave(Object[] models) {
                    finish();
                    return null;
                }
            }, cal);

        }
    }
}