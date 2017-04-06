package com.company.Lesson_Threads.Test_19;

/**
 * Created by Маша on 06.04.2017.
 */
public class Water implements Runnable {
    private String commonResource;

    public Water(String commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        boolean isCurrentThreadInterrupted = thread.isInterrupted();
        String threadName = thread.getName();

        try {
            while (!isCurrentThreadInterrupted) {
                System.out.println("Объект " + commonResource + ", нить " + threadName);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        }

    }

}

