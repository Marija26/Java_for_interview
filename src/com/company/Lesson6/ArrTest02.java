package com.company.Lesson6;

/**
 * Created by ПК on 19.09.2016.
 */
public class ArrTest02 {
    public static void main(String[] args) {
        int[] a = new int[16];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
