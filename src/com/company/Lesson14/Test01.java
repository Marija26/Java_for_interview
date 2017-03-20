package com.company.Lesson14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ПК on 31.10.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(6, "Vasia");
        map.put(7, "Masha");
        map.put(8, "Werter");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> pair = iterator.next();
            Integer a = pair.getKey();
            String d = pair.getValue();
            System.out.println(a + " - " + d);
        }

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            Integer a = pair.getKey();
            String d = pair.getValue();
            System.out.println(a + " - " + d);
        }
    }


}
