package com.company.Lesson13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ПК on 27.10.2016.
 */
public class Class05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first", "1");
        map.put("second", "2");
        map.put("third", "3");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
