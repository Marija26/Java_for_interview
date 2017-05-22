package com.company.Interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Маша on 15.05.2017.
 */
public class TreeMapSort {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "fewfwe");
        map.put("B", "fee");
        map.put("C", "fewefwefwefwefwfwe");
        map.put("E", "fewefwefwefwefwfwe");
        map.put("D", "fewfwefwe");

        Map<String, String> map1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res = map.get(o2).length() - map.get(o1).length();
                return res == 0 ? -1 : res;
            }
        });

        map1.putAll(map);

        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
