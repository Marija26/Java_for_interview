package com.company.Lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ПК on 27.10.2016.
 */
public class Ckass04 {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);

        Iterator<Integer>iterator = list.iterator();

        while (iterator.hasNext()){
            Integer a = iterator.next();
            System.out.println(a);
        }
    }
}
