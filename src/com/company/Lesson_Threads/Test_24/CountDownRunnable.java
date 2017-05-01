package com.company.Lesson_Threads.Test_24;

import com.company.Lesson_Threads.Test_21.*;

/**
 * Created by Маша on 01.05.2017.
 */
public class CountDownRunnable implements Runnable {
    private int countIndexDown = My_Thread.number;
    private Thread t;
    public CountDownRunnable(String name){
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public String toString() {
        return t.getName() + ": " + countIndexDown;
    }

    @Override
    public void run() {
        while (countIndexDown!=0){
            System.out.println(toString());
            countIndexDown--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
