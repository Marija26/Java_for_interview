package com.company.Lesson_Threads;

/**
 * Created by Маша on 01.05.2017.
 */
public class My_Thread extends Thread{
    String message = "inside My_Thread";

    @Override
    public void run() {
        for (int i = 0; i <9 ; i++) {
            System.out.println(message + i);
        }

    }
}
