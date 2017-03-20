package com.company.Lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 24.09.2016.
 */
/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
            if (a[i] < min) {
                min = a[i];

            }
            if (a[i] > max){
                max = a[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }

}