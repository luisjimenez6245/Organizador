package com.equipomiguelyluis.organizador.models;
import com.equipomiguelyluis.organizador.models.utils.Modelo;

import java.util.Date;
import com.equipomiguelyluis.organizador.models.Classificacion;
import  com.equipomiguelyluis.organizador.models.TipoNotificacion;

public class Recordatorio extends  Modelo {

    public Date fecha;
    public String contenido;
    public Classificacion classificacion;
    public Boolean revisada = false;
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
