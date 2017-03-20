package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 17.10.2016.
 */
/* Максимальное среди массива на 10 чисел
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
public class Class9 {
    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        System.out.println(max(array));
    }


    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > max)
                max = array[i];

        }
        return max;
    }


}
