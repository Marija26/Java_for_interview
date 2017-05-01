package com.company.Lesson_Threads.Test_24;

/**
 * Created by Маша on 01.05.2017.
 */
public class CountUpRunnable implements Runnable {
    private int countIndexDown = 1;
    private Thread t;
    public CountUpRunnable(String name){
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public String toString() {
        return t.getName() + ": " + countIndexDown;
    }

    @Override
    public void run() {
        while (countIndexDown!=6){
            System.out.println(toString());
            countIndexDown++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
