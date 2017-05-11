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

    @Override
    public String toString() {
        String s = result.toString();
        return s.substring(1, s.length()-1);
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
