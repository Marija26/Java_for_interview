package com.company.Lesson10;

/**
 * Created by ПК on 17.10.2016.
 */
// 5 значений минимум
public class Class8 {
    public static void main(String[] args) {
        int [] array = {5, 8, 90, 5, 3};
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] < min)
                min = array[i];


        }
        System.out.println(min);

    }
}
