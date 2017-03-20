package com.company.Lesson_Threads.Task_09;

/**
 * Created by Маша on 13.02.2017.
 */
public class Horse extends Thread {
    private volatile boolean isFinished = false;

    public boolean isFinished() {
        return isFinished;
    }
    public Horse(String name){
        super(name);

        }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(i == 999) {
                System.out.println(getName() + " has finished the race!");
                isFinished = true;
            }
        }
    }
}




