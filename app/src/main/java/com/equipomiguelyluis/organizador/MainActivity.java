package com.equipomiguelyluis.organizador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.equipomiguelyluis.organizador.views.RecordatorioForm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        switch (item.getItemId()){
            case R.id.add_clasificacion:
                toast = Toast.makeText(this, "Crear Clasificacion", Toast.LENGTH_SHORT);


                break;
            case R.id.add_recordatorio:
                toast = Toast.makeText(this, "Crear Recordatorio", Toast.LENGTH_SHORT);
                Intent intent = new Intent(this, RecordatorioForm.class);
                startActivity(intent);
                break;
        }
        if(toast != null){
            toast.show();
        }
        return super.onOptionsItemSelected(item);
    }
}