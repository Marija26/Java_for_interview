package com.company.Lesson_Threads.MyThread;

/**
 * Created by Маша on 09.02.2017.
 */
public class TestThread {
    public static void main(String[] args) {
        Task01 t = new Task01();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
