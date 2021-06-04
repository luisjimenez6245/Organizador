package com.equipomiguelyluis.organizador.source.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.equipomiguelyluis.organizador.models.TipoNotificacion;

import java.util.List;

@Dao
public interface TipoNotificacionDao {
    @Query("Select * from tiponotificacion")
    List<TipoNotificacion> getAll();

    @Query("Select * from tiponotificacion where id = :id")
    List<TipoNotificacion> getById(int id);

    @Insert
    void insertAll(TipoNotificacion... items);

    @Delete
    void delete(TipoNotificacion item);
}
