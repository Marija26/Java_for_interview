package com.company.Lesson02;

/**
 * Created by ПК on 01.09.2016.
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(sum(50,100));
        System.out.println(minus(50,100));
        System.out.println(multipl(50,100));
        System.out.println(dev(50,100));

    }

    public static int sum (int a, int b ){
        return a+b;

    }
    public static int minus (int a, int b ){
        return a-b;
    }
    public static int multipl (int a, int b ){
        return a*b;
    }
    public static double dev (double a, double b ){
        return a/b;
    }

}
