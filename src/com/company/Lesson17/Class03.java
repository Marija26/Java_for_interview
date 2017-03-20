package com.company.Lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 10.11.2016.
 */
/* Пять наибольших чисел
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/
public class Class03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = Integer.parseInt (reader.readLine ());

        }
        sort (list);
        for (int i = 0; i < 5; i++) {
            System.out.println (list[i]);
        }

    }



    public static void sort(int[] list) {                 //  23 17 32 5 -> 23, 32, 17, 5 ->
        for (int i = 0; i < list.length - 1; i++) {       // i = 0; 0 < 3; i = 1;
            for (int j = 0; j < list.length - 1 - i; j++) {  // j =0; j < 3; j =1; j=0; j < 2;
                if (list[j] < list[j + 1]) {             // 23 < 17; 17 < 32; 23 < 32;
                    int temp = list[j];                  //          temp = 17; temp = 23
                    list[j] = list[j + 1];               //          list[1] = 32; list[0] = 32
                    list[j + 1] = temp;                  //          list[2] = 17; list[1] = 23


                }

            }
        }

    }
}
