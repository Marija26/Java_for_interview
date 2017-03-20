package com.company.Lesson18;

/**
 * Created by ПК on 14.11.2016.
 */
/*
Написать 3 метода, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/
public class Test02 {
    public static void main(String[] args) {
        method1();
    }
    public static StackTraceElement[] method1(){
        method2 ();
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        return  stackTraceElements;

    }

    public static StackTraceElement[] method2(){
        method3 ();
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        return  stackTraceElements;
    }

    public static StackTraceElement[] method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        return  stackTraceElements;
    }




}
