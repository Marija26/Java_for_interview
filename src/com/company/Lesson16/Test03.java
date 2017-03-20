package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 07.11.2016.
 */
/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти максимальное число среди элементов списка - метод getMinimum.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = createList ();
        System.out.println (getMin (list));
    }

    public static List createList() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<Integer> list = new ArrayList<> ();
        System.out.println ("Enter count of numbers:");
        int N = Integer.parseInt (reader.readLine ());
        System.out.println ("Enter numbers:");
        for (int i = 0; i < N; i++) {
            list.add (Integer.parseInt (reader.readLine ()));


        }
        return list;
    }

    public static int getMin(List<Integer> list) {
        int max = list.get (0);
        for (int i = 0; i < list.size (); i++) {
            if (max < list.get (i))
                max = list.get (i);

        }
        return max;
    }


}
