package com.equipomiguelyluis.organizador.source;

import android.content.Context;

import androidx.room.Room;

import com.equipomiguelyluis.organizador.source.AppDatabase;

public class Source {

    public static AppDatabase db = null;

    public static AppDatabase createDatabase(Context context){
        if(db == null){
            db = Room.databaseBuilder(context,
                    AppDatabase.class, "recordatorios").build();
        }
        return db;
    }

}
