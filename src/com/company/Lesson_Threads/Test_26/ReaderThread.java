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
    List<String> result = new ArrayList<>();


    public ReaderThread(String name) {
        super(name);
        start();
    }

    @Override
    public String toString() {

        String s = result.toString();
        return s.substring(1, s.length() - 1);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(10);
                String s = MyThread.reader.readLine();
                result.add(s);
                MyThread.countReadStrings++;
            }

        } catch (IOException | InterruptedException e) {
        }
    }
}

