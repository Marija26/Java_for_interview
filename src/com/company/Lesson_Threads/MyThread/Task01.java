package com.company.Lesson_Threads.MyThread;

/**
 * Created by Маша on 09.02.2017.
 */
/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Task01 implements Runnable {

    @Override
    public void run() {
        System.out.println("My first thread");

    }

}
