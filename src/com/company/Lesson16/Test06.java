package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 07.11.2016.
 */
/* Задача по алгоритмам
Задача: Введите с клавиатуры 10 чисел и выведите их в возрастающем порядке.
*/
public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt (reader.readLine ());

        }
        sort (list);
        for (int i : list) {
            System.out.println (i);

        }


    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++)
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                }

            }

        }

    }

