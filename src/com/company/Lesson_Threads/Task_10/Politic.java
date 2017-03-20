package com.company.Lesson_Threads.Task_10;

/**
 * Created by Маша on 20.02.2017.
 */
public class Politic extends Thread {
    private int countSounds;

    public Politic(String name){
        super(name);
    }
    @Override
    public void run() {
        while (countSounds < MyThread.totalCountSpeeches * MyThread.soundsInOneSpeech)
            countSounds++;
    }
    int getCountSpeaches(){
        return countSounds/ MyThread.soundsInOneSpeech;
    }




    @Override
    public String toString() {
        return ((String.format("%s сказал речь %d раз. ", getName(), getCountSpeaches())));

    }
}
