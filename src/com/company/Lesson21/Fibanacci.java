package com.company.Lesson21;

/**
 * Created by ПК on 28.12.2016.
 */
public class Fibanacci {
    public static void main(String[] args) {
        System.out.println (fib (20));
    }


    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib (n - 1) + (fib (n - 2));

    }
}
