package com.equipomiguelyluis.organizador.source.views;

import java.util.List;
import java.util.function.Function;

public abstract class View<T> {

    public interface getListCallback<T>{
        void onGetList(List<T> list);
    }

    public interface insertCallback<T>{
        T onSave(T ... models);
    }

    public abstract void getAll(getListCallback func);

    public abstract void insert(insertCallback func, T ... models);
}


