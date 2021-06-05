package com.equipomiguelyluis.organizador.source;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;


import static com.equipomiguelyluis.organizador.models.dummy.DummyContent.itemsClasificacionList;
import static com.equipomiguelyluis.organizador.models.dummy.DummyContent.itemsTipoNotificacionList;


public class Source {

    public static AppDatabase dbInstance = null;

    public static AppDatabase createDatabase(Context context){
        if(dbInstance == null){
            RoomDatabase.Callback rdc = new RoomDatabase.Callback() {
                @Override
                public void onCreate(@NonNull SupportSQLiteDatabase db) {
                    super.onCreate(db);
                }

                @Override
                public void onOpen(@NonNull SupportSQLiteDatabase db) {
                    super.onOpen(db);
                }

                @Override
                public void onDestructiveMigration(@NonNull SupportSQLiteDatabase db) {
                    super.onDestructiveMigration(db);
                }
            };
            dbInstance = Room.databaseBuilder(context,
                    AppDatabase.class, "recordatorios").addCallback(rdc).allowMainThreadQueries().fallbackToDestructiveMigration().build();
        }
        System.out.println(dbInstance);
        return dbInstance;
    }

}
