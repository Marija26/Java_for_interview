package com.company.Lesson07;

/**
 * Created by ПК on 22.09.2016.
 */
public class Test02 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
           a[i] = 9 - i;
            System.out.println(a[i]);
        }
    }
}
