package com.equipomiguelyluis.organizador.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.equipomiguelyluis.organizador.R;
import com.equipomiguelyluis.organizador.source.Source;


public class RecordatorioForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorio_form);
        setTitle("Nuevo Recordatorio");
    }



}