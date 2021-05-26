package com.equipomiguelyluis.organizador.models;
import com.equipomiguelyluis.organizador.models.utils.Modelo;

import java.util.Date;
import com.equipomiguelyluis.organizador.models.Classificacion;

public class Recordatorio extends  Modelo {

    public Date fecha;
    public String contenido;
    public Classificacion classificacion;
    public Boolean revisada = false;

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

}
