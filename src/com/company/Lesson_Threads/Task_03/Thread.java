package com.company.Lesson_Threads.Task_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Маша on 09.02.2017.
 */
public class Thread extends java.lang.Thread{

    static{
        System.out.println("it's static block inside TestThread");
    }

    @Override
    public void run() {
        System.out.println("it's run method");;

    }
}
