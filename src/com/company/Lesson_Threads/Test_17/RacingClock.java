package com.company.Lesson_Threads.Test_17;


/**
 * Created by Маша on 21.03.2017.
 */
public class RacingClock extends Thread {
    @Override
    public void run() {
        try {
            while (MyThread.countSeconds > 0) {
                System.out.print(MyThread.countSeconds-- + " ");
                Thread.sleep(1000);
            }
            System.out.println("Marsh!");
        } catch (InterruptedException e) {
            System.out.println("Prervano!");
        }
    }
}


