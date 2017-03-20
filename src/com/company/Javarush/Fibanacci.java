package com.company.Javarush;

/**
 * Created by ПК on 19.01.2017.
 */
public class Fibanacci {
    public static void main(String[] args) {
        int a = 11;
        for (int i = 0; i <=a ; i++) {
            System.out.println (fib (i));
        }



    }
    public static int fib(int a){
        if(a == 0) return 0;
        if(a == 1) return 1;
        if(a==2) return 1;
        return fib(a-1)+fib(a-2);

    }
}
