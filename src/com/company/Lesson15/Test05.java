package com.company.Lesson15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ПК on 07.11.2016.
 */
public class Test05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<> ();
        map.put ("jh", "hjg");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet ().iterator ();
        while(iterator.hasNext ()){
            Map.Entry<String, String> pair = iterator.next ();

        }



    }
}
