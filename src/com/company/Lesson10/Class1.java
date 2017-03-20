package com.company.Lesson10;

/**
 * Created by ПК on 17.10.2016.
 */
public class Class1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println(a + " " + b);
        swap(a, b);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

}
