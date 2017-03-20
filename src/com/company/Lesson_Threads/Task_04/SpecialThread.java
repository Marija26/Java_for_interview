package com.company.Lesson_Threads.Task_04;

import com.company.Lesson_Threads.Task_03.Thread;
import com.company.Tests.StackTrace;

/**
 * Created by Маша on 09.02.2017.
 */
public class SpecialThread implements Runnable {

    @Override
    public void run() {
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println("run: " + element);
        }
    }
}
