package com.company.Lesson_Threads.Test_20;

/**
 * Created by Маша on 10.04.2017.
 */
public class NameOfDefferentThreads extends Thread {
    void printMsg() throws InterruptedException {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);
        Thread.sleep(1000);}

    @Override
    public void run() {
        for (int i = 0; i <MyThread.count ; i++) {
            try {
                printMsg();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

