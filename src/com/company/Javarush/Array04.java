package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 02.11.2016.
 */
/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Array04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i <array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.println(array[i]);
        }

        for (int i = 0; i <array.length ; i++) {
            int j = array.length - 1 - i;
            System.out.println (array[j]);

        }
    }
}
