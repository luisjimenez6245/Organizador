package com.equipomiguelyluis.organizador.source.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.equipomiguelyluis.organizador.models.Recordatorio;

import java.util.List;

@Dao
public interface ClasificacionDao{

    @Query("Select * from classificacion")
    List<Recordatorio> getAll();

    @Query("Select * from classificacion where id = :id")
    List<Recordatorio> getById(int id);

    @Insert
    Recordatorio insert(Recordatorio item);

    @Delete
    void delete(Recordatorio item);
}
