package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 17.01.2017.
 */
public class TestSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        int[] array = new int[6];
        for (int a = 0; a < array.length; a++) {
            array[a] = Integer.parseInt (reader.readLine ());

            for (int i = array.length -1; i > 0; i--) {
                System.out.println (i);
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;


                        System.out.print (j);
                    }
                }


            }

        }


    }
}
