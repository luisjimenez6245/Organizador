package com.equipomiguelyluis.organizador.source.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.equipomiguelyluis.organizador.models.Recordatorio;

import java.util.List;

@Dao
public interface RecordatorioDao {

    @Query("SELECT * FROM recordatorio")
    List<Recordatorio> getAll();

    @Query("SELECT * FROM recordatorio where id  = :id")
    List<Recordatorio> getById(int id);

    @Insert
    Recordatorio insert(Recordatorio item);

    @Delete
    void delete(Recordatorio item);
}
