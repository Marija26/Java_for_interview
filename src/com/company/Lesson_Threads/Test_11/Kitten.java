package com.company.Lesson_Threads.Test_11;

/**
 * Created by Маша on 22.02.2017.
 */
public class Kitten extends Thread {
    Kitten(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + ", вылез из корзинки");
        try {
            MyThread.investigateWorld();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
