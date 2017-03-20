package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ПК on 07.11.2016.
 */
/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городом.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Map<String, String> map = new HashMap<> ();
        while (true){
            String key = reader.readLine ();
            if (key.isEmpty ()) break;
            String value = reader.readLine ();
            map.put(key,value);
        }

        String city = reader.readLine();
        for (Map.Entry<String, String> pair : map.entrySet ()) {
            String key = pair.getKey ();
            if (key.equals ( city))
                System.out.println (pair.getValue ());
        }

    }
}
