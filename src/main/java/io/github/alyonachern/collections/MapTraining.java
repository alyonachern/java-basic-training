package io.github.alyonachern.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTraining {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Сыр", 1);
        map.put("Йогурт", 6);
        map.put("Молоко", 6);
        map.put("Творог", 2);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " - " + value + " шт.");
        }

        int forPrint = map.get("Творог");
        System.out.println("Нужно купить " + forPrint + " упаковки творога");
        forPrint = map.get("Молоко");
        System.out.println("Также нужно купить " + forPrint + " упаковок молока");


        map.remove("Сыр");
        System.out.println("Убрала из списка сыр");
    }
}
