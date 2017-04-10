package com.company.Lesson_Threads.Test_21;

/**
 * Created by Маша on 10.04.2017.
 */
public class SleepingThread extends Thread {
    private static volatile int thradName = 0;

    public SleepingThread() {
        super(String.valueOf(++thradName));
        start();


    }

    volatile int countDownIndex = My_Thread.count;

    public void run() {
        while (true) {
            System.out.println(this);
            if (countDownIndex == 0) {
                return;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }

    }

    @Override
    public String toString() {
        return "#" + getName() + ": " + countDownIndex--;
    }
}
