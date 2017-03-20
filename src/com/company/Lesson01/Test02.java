package com.company.Lesson01;

/**
 * Created by ПК on 29.08.2016.
 */
public class Test02 {
    public static void main (String [] args){
        int a = 5;   //7
        int b = 7;   //2
        int c = 2;   //5

        int y = a;
        a = b;
        b = c;
        c = y;

        System.out.println(a + " " + b + " " + c);
    }
}
