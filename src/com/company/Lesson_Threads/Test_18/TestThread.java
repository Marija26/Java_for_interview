package com.company.Lesson_Threads.Test_18;

/**
 * Created by Маша on 03.04.2017.
 */
public class TestThread implements Runnable {
  private boolean interrupt = false;
    public void ourInterruptMethod(){
       this.interrupt = true;
    }
    @Override
    public void run() {
        while (!interrupt){
            try {
                Thread.sleep(500);
                System.out.println("Tik");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
