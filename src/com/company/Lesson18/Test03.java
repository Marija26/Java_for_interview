package com.company.Lesson18;

/**
 * Created by ПК on 14.11.2016.
 */
/*
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/
public class Test03 {
    public static void main(String[] args) {
        method1();
    }
    public static String method1(){
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        String b = stackTraceElements[2].getMethodName ();
        System.out.println (b);
        return b;
    }
    public static String method2(){
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        String a = stackTraceElements[2].getMethodName ();
        System.out.println (a);
        return a;
    }
    public static String method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        String element = stackTraceElements[2].getMethodName ();
        System.out.println (element);
        return element;
    }
}
