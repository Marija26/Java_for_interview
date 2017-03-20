package com.company.Lesson13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ПК on 27.10.2016.
 */
public class Class06 {
    public static void main(String[] args) {
        Map<Integer, String>map = new HashMap<>();
        map.put(1, "wer");
        map.put(2, "qwas");
        map.put(3, "wujh");
        Iterator<Map.Entry<Integer, String>>iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> pair = iterator.next();
            Integer key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
