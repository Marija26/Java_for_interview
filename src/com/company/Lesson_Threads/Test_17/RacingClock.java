package com.company.Lesson_Threads.Test_17;


/**
 * Created by Маша on 21.03.2017.
 */
public class RacingClock  extends Thread {
    private boolean isCancel = false;

    public void cancel() {
        this.isCancel = true;
    }

    @Override
    public void run() {
        while (!isCancel) {

           if (MyThread.countSeconds < 4 && MyThread.countSeconds > 0) {
               System.out.print(MyThread.countSeconds-- + " ");
           }
          else if  (MyThread.countSeconds < 5 && MyThread.countSeconds > 0) {
                System.out.print(MyThread.countSeconds-- + " ");}
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
            System.out.println("Marsh!");

        }
    }


