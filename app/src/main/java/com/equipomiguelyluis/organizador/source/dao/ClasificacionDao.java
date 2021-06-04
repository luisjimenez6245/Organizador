package com.equipomiguelyluis.organizador.source.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.equipomiguelyluis.organizador.models.Classificacion;

import java.util.List;

@Dao
public interface ClasificacionDao{

    @Query("Select * from classificacion")
    List<Classificacion> getAll();

    @Query("Select * from classificacion where id = :id")
    List<Classificacion> getById(int id);

    @Insert
    void insertAll(Classificacion... items);

    @Delete
    void delete(Classificacion item);
}
