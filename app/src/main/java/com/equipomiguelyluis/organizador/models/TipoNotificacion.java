package com.equipomiguelyluis.organizador.models;
import com.equipomiguelyluis.organizador.models.utils.Modelo;

public class TipoNotificacion extends  Modelo{

    public String nombre;
    public boolean seMandaNotificacion = false;
    public int minutos = 0;

    public TipoNotificacion(int id, String nombre, boolean seMandaNotificacion, int minutos){
        this.id = id;
        this.nombre = nombre;
        this.seMandaNotificacion = seMandaNotificacion;
        this.minutos = minutos;
    }

}
