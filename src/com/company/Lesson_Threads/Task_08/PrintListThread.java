package com.company.Lesson_Threads.Task_08;

import static com.company.Lesson_Threads.Task_08.MyThread.getList;
import static com.company.Lesson_Threads.Task_08.MyThread.printList;

/**
 * Created by Маша on 13.02.2017.
 */
public class PrintListThread extends Thread {

    public PrintListThread(String name){
        super(name);

    }

    @Override
    public void run() {
        printList(getList(20), getName());


    }
}
