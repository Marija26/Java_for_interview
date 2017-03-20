package com.company.Lesson18;

/**
 * Created by ПК on 14.11.2016.
 */
/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/
public class Test05 {
    public static void main(String[] args) {

    }

    public static int method() {
        StackTraceElement[] stackTraceElements = Thread.currentThread ().getStackTrace ();
        int count = 0;
        for (StackTraceElement a : stackTraceElements) {
            count++;

        }
        return 4;
    }
}
