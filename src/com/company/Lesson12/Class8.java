package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 26.10.2016.
 */
//Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
public class Class8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());

        }
        five(list);
        for (int i = 0; i < list.length; i++) {


        }
        System.out.println(list[0]+" " +list[1] + " " + list [2] + " " + list [3] + " " + list [4]);

    }




    public static void five(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }

    }

}


