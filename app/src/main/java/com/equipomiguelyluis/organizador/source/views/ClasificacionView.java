package com.equipomiguelyluis.organizador.source.views;

import com.equipomiguelyluis.organizador.models.Classificacion;

import java.util.List;

import static com.equipomiguelyluis.organizador.source.Source.dbInstance;

public class ClasificacionView extends  View<Classificacion>{

    @Override
    public void getAll(View.getListCallback func) {
        new Thread(() -> {
           List<Classificacion> res = dbInstance.clasificacionDao().getAll();
           if(func != null){
               func.onGetList(res);
           }
        });
    }

    @Override
    public void insert(insertCallback func, Classificacion... models) {
        new Thread(() -> {
           dbInstance.clasificacionDao().insertAll(models);
            if(func != null){
                func.onSave(null);
            }
        });
    }

}
