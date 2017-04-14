package com.company.Lesson_Threads.Test_22;

/**
 * Created by Маша on 14.04.2017.
 */
public class GenerateThread extends Thread {

    public GenerateThread(){
        super(String.valueOf(++Test_21.countCreatedThreads));
       start();

    }

    @Override
    public String toString() {
        return this.getName() + " created";
    }

    @Override
    public void run() {
        while (Test_21.countCreatedThreads< Test_21.count){
            System.out.println(new GenerateThread());
        }


    }
}
