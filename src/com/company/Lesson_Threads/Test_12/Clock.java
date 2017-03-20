package com.company.Lesson_Threads.Test_12;

/**
 * Created by Маша on 23.02.2017.
 */
public class Clock extends Thread {
    Clock() throws InterruptedException {
        setPriority(MAX_PRIORITY);
        start();

    }


    void printTikTak() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Tik");
        Thread.sleep(500);
        System.out.println("Tak");
    }


    @Override
    public void run() {
        while (!ThreadTest.isStopped) {
            try {
                printTikTak();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


