package com.company.Lesson13;

import java.util.*;

/**
 * Created by ПК on 27.10.2016.
 */
public class Class02 {
    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer x : list) {
            System.out.println(x);
        }

        Set<String> array = new HashSet<>();
        array.add("wer");
        array.add("qwe");
        for (String s : array) {
            System.out.println(s);
        }

        Map<Integer, String> arr = new HashMap<>();
        arr.put(5, "Ania");
        arr.put(8, "Anka");
        arr.put(9, "Ania");
        for (Map.Entry<Integer, String> integerStringEntry : arr.entrySet()) {
            Integer key = integerStringEntry.getKey();
            String value = integerStringEntry.getValue();
            System.out.println(key + value);

        }

    }
}
