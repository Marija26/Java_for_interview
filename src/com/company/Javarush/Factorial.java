package com.company.Javarush;

/**
 * Created by ПК on 19.01.2017.
 */
public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        System.out.println (fact(a));
    }
    public static int fact(int n){
        return (n==0)?1:n*fact(n-1);
    }
}
