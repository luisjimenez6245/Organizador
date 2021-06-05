package com.equipomiguelyluis.organizador.source.views;

import com.equipomiguelyluis.organizador.models.Classificacion;

import java.util.List;

import static com.equipomiguelyluis.organizador.source.Source.dbInstance;

public class ClasificacionView extends  View<Classificacion>{

    @Override
    public void getAll(View.getListCallback func) {
        new Thread(() -> {
           List<Classificacion> res = dbInstance.clasificacionDao().getAll();
            System.out.println(res.size());
           if(func != null){
               func.onGetList(res);
           }
        }).run();
    }

    @Override
    public void insert(insertCallback func, Classificacion... models) {
        System.out.println("rpujejba");
        new Thread(() -> {
           dbInstance.clasificacionDao().insertAll(models);
            if(func != null){
                func.onSave(null);
            }
        }).run();
    }

}
