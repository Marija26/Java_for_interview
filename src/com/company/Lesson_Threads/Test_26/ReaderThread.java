package com.company.Lesson_Threads.Test_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 10.05.2017.
 */
public class ReaderThread extends Thread {
    static List<String> result =new ArrayList<>();

    public ReaderThread(String name){
        super(name);
        start();


    }
    Thread thread = currentThread();

    @Override
    public String toString() {
       return result.toString();

    }

    @Override
    public void run() {

        while (!isInterrupted()){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String s = reader.readLine();
                result.add(s);
                MyThread.countReadStrings++;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
