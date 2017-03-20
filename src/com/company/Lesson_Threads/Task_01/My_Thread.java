package com.company.Lesson_Threads.Task_01;

/**
 * Created by Маша on 09.02.2017.
 */
public class My_Thread extends Thread {
    public My_Thread() {
    }

    static{
        System.out.println("Static block");
    }

    @Override
    public void run() {
        System.out.println("ok");;
    }
}
