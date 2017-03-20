package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 24.10.2016.
 */
/* Максимальное и минимальное числа в массиве
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
public class Class5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer>array = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            array.add(Integer.parseInt(reader.readLine()));

        }
        int max = array.get(0);
        for (int i = 0; i <array.size() ; i++) {
            if (array.get(i) > max) max = array.get(i);

        }
        int min = array.get(0);
        for (int i = 0; i <array.size() ; i++) {
            if (array.get(i) < min) min = array.get(i);

        }
        System.out.println(max);
        System.out.println(min);
    }
}
