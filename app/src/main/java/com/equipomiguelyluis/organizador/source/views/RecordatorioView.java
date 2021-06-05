package com.equipomiguelyluis.organizador.source.views;

import com.equipomiguelyluis.organizador.models.Recordatorio;

import java.util.List;

import static com.equipomiguelyluis.organizador.source.Source.dbInstance;

public class RecordatorioView extends View<Recordatorio> {
    @Override
    public void getAll(getListCallback func) {
        new Thread(() -> {
            List<Recordatorio>  res =  dbInstance.recordatorioDao().getAll();
            func.onGetList(res);
        }).run();
    }

    @Override
    public void insert(insertCallback func, Recordatorio... models) {

    }
}
