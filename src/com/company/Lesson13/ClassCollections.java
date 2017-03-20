package com.company.Lesson13;

import java.util.*;

/**
 * Created by ПК on 27.10.2016.
 */
public class ClassCollections {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("first2");
        list.add("first3");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("first2");
        set.add("first3");
        set.add("first4");
        set.add("first5");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        Map<String, String> map = new HashMap<>();
        map.put("ua", "ukraine");
        map.put("1ua", "ukraine");
        map.put("ru", "russia");
        map.put("usa", "united");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
