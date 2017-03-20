package com.company.Lesson15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 03.11.2016.
 */
/* Одинаковые имя и фамилия
Создать словарь (MapCat<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        // BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Map<String, String> map = createMap ();
        System.out.println (getCountTheSameFirstName (map, "Simn"));
        System.out.println (getCountTheSameLastName (map, "Sim"));
    }

    private static Map createMap() {
        Map<String, String> map1 = new HashMap<> ();
        map1.put ("Sim1", "Simn");
        map1.put ("Simn", "Tomn");
        map1.put ("Simn", "Arbusn");
        map1.put ("Baby", "Simn");
        map1.put ("Art", "Simn");
        map1.put ("Sim", "Dogn");
        map1.put ("Eat", "Eatn");
        map1.put ("Food", "Foodn");
        map1.put ("Gevey", "Geveyn");
        map1.put ("Hugs", "Hugsn");
        return map1;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int countNames = 0;
        for (Map.Entry<String, String> pair : map.entrySet ()) {
            String value = pair.getValue ();
            if (value.equals (name)) {
                countNames++;
            }
        }
        return countNames;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int countNames = 0;
        for (Map.Entry<String, String> pair : map.entrySet ()) {
            String key = pair.getKey ();
            if (key.equals (lastName)) {
                countNames++;

            }
        }
        return countNames;


    }
}
