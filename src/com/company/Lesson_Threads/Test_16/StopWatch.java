package com.company.Lesson_Threads.Test_16;

/**
 * Created by Маша on 21.03.2017.
 */
public class StopWatch extends Thread {
    private int seconds;
    @Override
    public void run() {

        try {
            while (!currentThread().isInterrupted())
            {
                Thread.sleep(1000);
                seconds++;
            }
        } catch (InterruptedException e) {
            System.out.println(seconds);
        }
    }
    }

