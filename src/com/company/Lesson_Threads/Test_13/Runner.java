package com.company.Lesson_Threads.Test_13;

/**
 * Created by Маша on 27.02.2017.
 */
public class Runner {
    private String name;
   private int speed;
   Stopwatch stopwatch;
   Runner(String name, int speed){
       this.name = name;
       this.speed =speed;
       this.stopwatch = new Stopwatch(this);



   }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
    void start(){
       stopwatch.start();

    }
}
