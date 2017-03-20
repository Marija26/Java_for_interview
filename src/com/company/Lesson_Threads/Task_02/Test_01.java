package com.company.Lesson_Threads.Task_02;



/**
 * Created by Маша on 09.02.2017.
 */
public class Test_01 {
    public static void main(String[] args) {
        My_Thread task = new My_Thread();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
    }
}
