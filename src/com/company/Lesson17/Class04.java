package com.company.Lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by ПК on 10.11.2016.
 */
public class Class04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Integer[] list = new Integer[10];
        for (int i = 0; i < 10; i++) {
            list[i] = Integer.parseInt (reader.readLine ());

        }
        sort (list);
        for (int i = 0; i < 5; i++) {
            System.out.println (list[i]);
        }

    }

    public static void sort(Integer[] array){
        Arrays.sort (array, Collections.reverseOrder ());
    }
}
