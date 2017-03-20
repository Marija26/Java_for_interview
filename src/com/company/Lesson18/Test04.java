package com.company.Lesson18;

/**
 * Created by ПК on 14.11.2016.
 */
/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/
public class Test04 {
    public static void main(String[] args) {
        method1 ();
    }
    public static int method1(){
        method2 ();
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        int a = stackTraceElements[2].getLineNumber();
        System.out.println (a);
        return a;
    }
    public static int method2(){
        method3 ();
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        int a = stackTraceElements[2].getLineNumber();
        System.out.println (a);
        return a;
    }
    public static int method3(){
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        int a = stackTraceElements[2].getLineNumber();
        System.out.println (a);
        return a;

    }

}
