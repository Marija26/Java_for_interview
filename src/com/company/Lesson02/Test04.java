package com.company.Lesson02;

/**
 * Created by ПК on 01.09.2016.
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println(convert(51));

        System.out.println(percent(50));

        print4("Prog");

        print5("Programmer");
    }

    public static double convert (double a){
        return a*25.4;
    }

     public static double percent (double r){
        return r + r*0.1;
    }

    public static void print4 (String d){
        System.out.println(d);
        System.out.println(d);
        System.out.println(d);
        System.out.println(d);
    }

    public static String print5 (String d){
        System.out.println(d);
        System.out.println(d);
        System.out.println(d);
        System.out.println(d);
        System.out.println(d);
        return d;
    }

}
