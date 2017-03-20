package com.company.Lesson15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ПК on 03.11.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<> ();
        map.put(5, "Kiev");
        map.put(6, "Moscow");
        map.put(7, "London");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet ().iterator ();
        while(iterator.hasNext ()){
            Map.Entry<Integer, String> pair = iterator.next ();
            Integer key = pair.getKey ();
            String value = pair.getValue ();
            System.out.println (key + " " + value);
        }

        for (Map.Entry<Integer, String> pair : map.entrySet ()) {
            Integer key = pair.getKey ();
            String value = pair.getValue ();
            System.out.println (key + " " + value);
        }


    }
}
