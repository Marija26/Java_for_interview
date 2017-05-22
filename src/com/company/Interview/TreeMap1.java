package com.company.Interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Маша on 15.05.2017.
 */
public class TreeMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("qweq", "ytwer");
        map.put("qwea", "ytwersdgzv");
        map.put("qwez", "ytwerzsdfvdxhg");
        map.put("qwep", "ytwerw");
        map.put("qwem", "ytwer");
        map.put("qwen", "ytwer");

        Map<String, String> map1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res = map.get(o2).length() - map.get(o1).length();
                return (res == 0) ? -1 : res;
            }
        });
        map1.putAll(map);
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+ entry.getValue());

        }
    }
}








