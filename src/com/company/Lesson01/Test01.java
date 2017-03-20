package com.company.Lesson01;

/**
 * Created by ПК on 29.08.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 53;
        long b = 12;
        String name = "Добро пожаловать!";
        char i = 'v';
        double g = 12.5;
        boolean y = true;

        System.out.println(name + " " + i);
        System.out.println(name + " : " + a);
        System.out.format("%s : %d %d", name, b, a);

    }
}
