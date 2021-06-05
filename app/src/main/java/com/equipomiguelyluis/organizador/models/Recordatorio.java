package com.equipomiguelyluis.organizador.models;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.equipomiguelyluis.organizador.models.utils.DateConverter;
import com.equipomiguelyluis.organizador.models.utils.Modelo;

import java.util.Date;
import com.equipomiguelyluis.organizador.models.Classificacion;
import  com.equipomiguelyluis.organizador.models.TipoNotificacion;

@Entity(foreignKeys = {
        @ForeignKey(entity = Classificacion.class, parentColumns = "id", childColumns = "classificacionId"),
        @ForeignKey(entity = TipoNotificacion.class, parentColumns =  "id" ,  childColumns = "tipoId")
})
public class Recordatorio extends  Modelo {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id", index = true)
    public int id = 0;

    @ColumnInfo(name = "fecha")
    @TypeConverters(DateConverter.class)
    public Date fecha;

    @ColumnInfo(name = "contenido")
    public String contenido;


    @ColumnInfo(name = "classificacionId", index = true)
    public int classificacionId;

    @Ignore
    public Classificacion classificacion;

    @ColumnInfo(name = "revisada")
    public Boolean revisada = false;


    @ColumnInfo(name = "tipoId", index = true)
    public int tipoId;

    @Ignore
    public TipoNotificacion tipo;


    public  Recordatorio(int id, Date fecha, String contenido, int classificacionId){
        this.id = id;
        this.fecha = fecha;
        this.contenido = contenido;
        this.classificacionId = classificacionId;

    }

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
