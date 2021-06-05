package com.equipomiguelyluis.organizador.source;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.equipomiguelyluis.organizador.models.Classificacion;
import com.equipomiguelyluis.organizador.models.Recordatorio;
import com.equipomiguelyluis.organizador.models.TipoNotificacion;
import com.equipomiguelyluis.organizador.source.dao.ClasificacionDao;
import com.equipomiguelyluis.organizador.source.dao.TipoNotificacionDao;
import com.equipomiguelyluis.organizador.source.dao.RecordatorioDao;

@Database(entities = {Recordatorio.class, TipoNotificacion.class, Classificacion.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ClasificacionDao clasificacionDao();
    public abstract RecordatorioDao recordatorioDao();
    public abstract TipoNotificacionDao tipoNotificacionDao();
}
