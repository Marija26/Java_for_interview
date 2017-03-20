package com.company.Lesson02;

/**
 * Created by ПК on 02.09.2016.
 */
public class Test05 {
    public static void main(String[] args) {
        swap(5, 6);
    }

    private static void swap (int a, int b){
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

}

