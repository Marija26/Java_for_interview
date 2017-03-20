package com.company.Lesson_Threads.Task_04;

/**
 * Created by Маша on 09.02.2017.
 */
/* Вывод стек-трейса
1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль свой стек-трейс.
*/
public class MyThread {
    public static void main(String[] args) {
        Thread t = new Thread(new SpecialThread());
        t.start();

    }


}
