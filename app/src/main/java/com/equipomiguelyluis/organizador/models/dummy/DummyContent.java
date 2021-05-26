package com.equipomiguelyluis.organizador.models.dummy;

import android.app.Notification;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.equipomiguelyluis.organizador.models.*;
/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Recordatorio> ITEMS = new ArrayList<Recordatorio>();

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Classificacion> ITEMS_CLASSIFICACION = new ArrayList<Classificacion>();
    public static final List<TipoNotificacion> ITEMS_TIPO_NOTIFICACION = new ArrayList<TipoNotificacion>();


    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Recordatorio> ITEM_MAP = new HashMap<String, Recordatorio>();

    private static final int COUNT = 10;

    static {
        ITEMS_CLASSIFICACION.add(new Classificacion(1, "Personal"));
        ITEMS_CLASSIFICACION.add(new Classificacion(2, "Trabajo"));
        ITEMS_CLASSIFICACION.add(new Classificacion(3, "Familia"));

        ITEMS_TIPO_NOTIFICACION.add(new TipoNotificacion(1, "Un día antes", true, 1440));
        ITEMS_TIPO_NOTIFICACION.add(new TipoNotificacion(1, "10 minutos antes", true, 10));
        ITEMS_TIPO_NOTIFICACION.add(new TipoNotificacion(1, "Sin recordatorio", false, 0));


        for (int i = 1; i <= COUNT; i++) {
            addRecordatorio(
                    new Recordatorio(
                            i,
                            new Date(),
                            "Recordatorio: " + i,
                            ITEMS_CLASSIFICACION.get(i % 3),
                            (i%3) == 0,
                            ITEMS_TIPO_NOTIFICACION.get(i % 3)
                    ));

        }
    }

    private static void addRecordatorio(Recordatorio item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.id, item);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

}