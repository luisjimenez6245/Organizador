package com.equipomiguelyluis.organizador.models.dummy;

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
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Recordatorio> ITEM_MAP = new HashMap<String, Recordatorio>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addRecordatorio(createDummyItem(i));
        }
    }

    private static void addRecordatorio(Recordatorio item) {
        ITEMS.add(item);
        ITEM_MAP.put("" + item.id, item);
    }

    private static Recordatorio createDummyItem(int position) {
        Classificacion clas = new Classificacion(position,"prueba");
        return new Recordatorio(position, new Date(), "" + position, clas);
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