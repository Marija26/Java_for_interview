package com.company.Interview;

/**
 * Created by ПК on 26.12.2016.
 */
public class Class02_Factorial_Simple {
    public static void main(String[] args) {
        System.out.println (fact (5));
    }

    public static int fact(int n) {
        return (n == 0) ? 1 : n * fact (n - 1);
    }


}
