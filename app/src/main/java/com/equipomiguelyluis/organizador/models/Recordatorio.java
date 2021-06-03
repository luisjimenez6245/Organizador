package com.equipomiguelyluis.organizador.models;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.equipomiguelyluis.organizador.models.utils.Modelo;

import java.util.Date;
import com.equipomiguelyluis.organizador.models.Classificacion;
import  com.equipomiguelyluis.organizador.models.TipoNotificacion;

@Entity
public class Recordatorio extends  Modelo {


    @PrimaryKey
    public int id = 0;

    @ColumnInfo(name = "name")
    public Date fecha;

    @ColumnInfo(name = "name")
    public String contenido;

    @ForeignKey()
    public Classificacion classificacion;

    @ColumnInfo(name = "name")
    public Boolean revisada = false;

    @ColumnInfo(name = "name")
    public TipoNotificacion tipo;

    public  Recordatorio(int id, Date fecha, String contenido, Classificacion classificacion){
        this.id = id;
        this.fecha = fecha;
        this.contenido = contenido;
        this.classificacion = classificacion;
    }

    public Recordatorio(int id, Date fecha, String contenido, Classificacion classificacion, Boolean revisada){
        this.id = id;
        this.fecha = fecha;
        this.contenido = contenido;
        this.classificacion = classificacion;
        this.revisada = revisada;
    }

    public Recordatorio(int id, Date fecha, String contenido, Classificacion classificacion, Boolean revisada, TipoNotificacion tipo){
        this.id = id;
        this.fecha = fecha;
        this.contenido = contenido;
        this.classificacion = classificacion;
        this.revisada = revisada;
        this.tipo = tipo;
    }

    public Recordatorio(int id, String contenido, Classificacion classificacion, Boolean revisada, TipoNotificacion tipo){
        this.id = id;
        this.fecha = new Date();
        this.contenido = contenido;
        this.classificacion = classificacion;
        this.revisada = revisada;
        this.tipo = tipo;
    }

}
