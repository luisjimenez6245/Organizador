package com.equipomiguelyluis.organizador.models;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.equipomiguelyluis.organizador.models.utils.Modelo;


@Entity
public class TipoNotificacion extends  Modelo{

    @PrimaryKey
    public int id = 0;

    @ColumnInfo(name = "nombre")
    public String nombre;

    @ColumnInfo(name = "seMandaNotificacion")
    public boolean seMandaNotificacion = false;

    @ColumnInfo(name = "minutos")
    public int minutos = 0;

    public TipoNotificacion(int id, String nombre, boolean seMandaNotificacion, int minutos){
        this.id = id;
        this.nombre = nombre;
        this.seMandaNotificacion = seMandaNotificacion;
        this.minutos = minutos;
    }

}
