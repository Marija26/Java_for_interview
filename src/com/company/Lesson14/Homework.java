package com.company.Lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ПК on 02.11.2016.
 */
/*Удалить все числа больше 10

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 Удалить из множества все числа больше 10.*/
public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Set<Integer> num = new HashSet<> ();

        for (int i = 0; i < 20; i++) {
            num.add (Integer.parseInt (reader.readLine ()));
        }

        Iterator<Integer> iterator = num.iterator ();
        while (iterator.hasNext ()) {
            if (iterator.next () > 10)
                iterator.remove ();
        }

        for (Integer x : num) {
            System.out.println (x);
        }

    }
}


