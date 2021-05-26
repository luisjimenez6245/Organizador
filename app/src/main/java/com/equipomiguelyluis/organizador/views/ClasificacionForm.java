package com.equipomiguelyluis.organizador.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.equipomiguelyluis.organizador.R;

public class ClasificacionForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion_form);
        setTitle("Nueva Clasificación");
    }
}