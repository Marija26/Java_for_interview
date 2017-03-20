package com.company.Lesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ПК on 27.10.2016.
 */
public class Class03 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Text1");
        set.add("Text2");
        set.add("Text3");

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
