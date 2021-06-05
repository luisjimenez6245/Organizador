package com.equipomiguelyluis.organizador.models;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.equipomiguelyluis.organizador.models.utils.Modelo;

@Entity
public class Classificacion extends  Modelo{

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", index = true)
    public int id = 0;

    @ColumnInfo(name = "nombre")
    public String nombre;

    public Classificacion(String nombre){
        this.nombre = nombre;
    }

}
