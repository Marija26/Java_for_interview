package com.company.TestFromQizful.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Маша on 22.05.2017.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");
*/
public class MapTask {
    public static void main(String[] args) {
        Map<String, String> map = people();

        System.out.println(removeMap(map));
    }

    static int a = 10;

    public static Map people() {
        a = 10;
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;

    }

    public static Map removeMap(Map<String, String> map) {
        Map<String, String> map1 = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> entry1 : map.entrySet()) {
                if (entry.getValue().equals(entry1.getValue())) {
                    count++;
                }
            }
            if (count == 1) {
                map1.put(entry.getKey(), entry.getValue());
            }

        }
        return map1;

    }
}
