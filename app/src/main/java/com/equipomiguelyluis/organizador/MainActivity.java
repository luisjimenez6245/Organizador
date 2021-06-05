package com.equipomiguelyluis.organizador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.equipomiguelyluis.organizador.source.Source;
import com.equipomiguelyluis.organizador.views.ClasificacionForm;
import com.equipomiguelyluis.organizador.views.RecordatorioForm;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Source.createDatabase(this.getApplicationContext());
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast toast = null;
        Intent  intent = null;
        switch (item.getItemId()){
            case R.id.add_clasificacion:
                toast = Toast.makeText(this, "Crear Clasificacion", Toast.LENGTH_SHORT);
                intent = new Intent(this, ClasificacionForm.class);
                break;
            case R.id.add_recordatorio:
                toast = Toast.makeText(this, "Crear Recordatorio", Toast.LENGTH_SHORT);
                intent = new Intent(this, RecordatorioForm.class);
                break;
        }
        if(toast != null){
            toast.show();
        }
        if(intent != null){
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}