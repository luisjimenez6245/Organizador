package com.equipomiguelyluis.organizador.models;
import com.equipomiguelyluis.organizador.models.utils.Modelo;

public class Classificacion extends  Modelo{

    public String nombre;

    public Classificacion(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

}
