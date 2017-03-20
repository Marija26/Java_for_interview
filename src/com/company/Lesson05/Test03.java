package com.company.Lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 15.09.2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        for (int i = 0; i < 10; i++){
            System.out.println(a + " " + i);
        }

    }
}
