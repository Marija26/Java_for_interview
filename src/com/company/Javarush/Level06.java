package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 17.01.2017.
 */
//Задача: Программа вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

public class Level06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<Integer> list = new ArrayList<> ();
        while (true) {
            String s = reader.readLine ();
            if (s.isEmpty ()) break;
            list.add (Integer.parseInt (s));

            sort (list);

        }

        for (Integer integer : list) {
            System.out.println (integer);

        }


    }

    public static void sort(List<Integer> list) {
        for (int i = list.size () - 1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get (j) > list.get (j + 1)) {
                    int temp = list.get (j);
                    list.set (j, list.get (j + 1));
                    list.set (j + 1, temp);
                }

            }


        }


    }
}

