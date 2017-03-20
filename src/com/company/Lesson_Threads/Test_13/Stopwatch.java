package com.company.Lesson_Threads.Test_13;

/**
 * Created by Маша on 27.02.2017.
 */
public class Stopwatch extends Thread{
    private Runner owner;
    int stepNumber;
    Stopwatch(Runner owner){
        this.owner = owner;

    }
    void doSeveralSteps() throws InterruptedException {
        stepNumber++;

        int speed1 = owner.getSpeed();
        Thread.sleep(1000 / speed1);
        System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
        String s = "text";
        System.out.println(s + 2 + 2);
    }

    @Override
    public void run() {
        while (!MyThread.isStooped){
            try {
                doSeveralSteps();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
