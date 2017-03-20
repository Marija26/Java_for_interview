package com.company.Lesson15;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ПК on 03.11.2016.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (MapCat<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Test04 {
    public static void main(String[] args) {
        Map<String, String> map = createMap ();
        map = deleteTheSameNames (map);
        System.out.println (map);
    }

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<> ();
        map.put ("Rooney", "Leo");
        map.put ("Lloris", "Hugo");
        map.put ("Messi", "Leo");
        map.put ("Ronaldo", "Cristiano");
        map.put ("Maldini", "Paolo");
        map.put ("Indzaghi", "Pipo");
        map.put ("Del Piero", "Alesandro");
        map.put ("Balotelli", "Mario");
        map.put ("Gotze", "Mario");
        map.put ("Gomez", "Mario");

        return map;
    }

    public static Map<String, String> deleteTheSameNames(Map<String, String> map) {
        Map<String, String> map1 = new HashMap<> ();
        for (Map.Entry<String, String> pair : map.entrySet ()) {
            int count = 0;
            for (String s : map.values ()) {
                if (pair.getValue ().equals (s)) count++;
            }
            if( count == 1) map1.put(pair.getKey(), pair.getValue ());

        }
        return map1;
    }

}
