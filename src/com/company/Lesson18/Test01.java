package com.company.Lesson18;

/**
 * Created by ПК on 14.11.2016.
 * LIFO - last in first out
 */
public class Test01 {
    public static void main(String[] args) {
        method1 ();
    }
    public static void method1(){
        method2 ();
    }
    public static void method2(){
        method3 ();
    }
    public static void method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        int count = 0;
        for (StackTraceElement s : stackTraceElements) {
            count++;
            System.out.println (s.getMethodName () + " " + count);
        }
    }
}
