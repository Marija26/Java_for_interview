package com.company.Lesson_Threads.Test_15;

/**
 * Created by Маша on 09.03.2017.
 */
public class Plane extends Thread {
    public Plane(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        boolean isAlreadyTakenOff = false;
        while (!isAlreadyTakenOff) {
                if (MyThread.runway.getThread() == null) {
                    MyThread.runway.setThread(this);
                    System.out.println(getName() + " взлетает");
                    MyThread.takingOff();
                    System.out.println(getName() + " уже в небе");
                    isAlreadyTakenOff = true;
                    MyThread.runway.setThread(null);
                } else if (!this.equals(MyThread.runway.getThread())) {
                    System.out.println(getName() + " ожидает");
                    MyThread.waiting();
                }
        }
    }
}



