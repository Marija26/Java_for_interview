package com.company.Lesson_Threads.Task_06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 12.02.2017.
 */
//В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
public class MyThread {
    public static void main(String[] args) {
        SpecialThread specialThread = new SpecialThread();
        Thread thread = new Thread(specialThread);
        List<SpecialThread> list = new ArrayList<>();
        list.add(new SpecialThread());
        list.add(new SpecialThread());
        list.add(new SpecialThread());
        list.add(new SpecialThread());
        list.add(new SpecialThread());
        thread.start();




    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }

    }
}
