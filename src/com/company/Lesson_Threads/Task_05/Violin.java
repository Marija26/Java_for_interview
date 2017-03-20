package com.company.Lesson_Threads.Task_05;

import java.util.Date;

/**
 * Created by Маша on 09.02.2017.
 */
public class Violin implements MusicalInstrument {

    private String musician;
    public Violin(String musician){
        this.musician = musician;
    }
    @Override
    public Date startPlaying() {
        return new Date() ;
    }

    @Override
    public Date stopPlaying() {
        return new Date() ;
    }

    @Override
    public void run() {
     Date date1 = startPlaying();
     MyThread.sleepNSeconds(1);
     Date date2 = stopPlaying();
        long msDelay = date2.getTime() - date1.getTime();
        System.out.println("Playing " + msDelay + "ms" );


    }
}
