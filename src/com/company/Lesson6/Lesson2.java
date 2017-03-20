package com.company.Lesson6;

/**
 * Created by ПК on 19.09.2016.
 */
public class Lesson2 {
    public static void main(String[] args) {
        int[] a = new int [10];
        for (int i = 0; i < a.length; i++){
            a[i] = 10 - i;

        }

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
