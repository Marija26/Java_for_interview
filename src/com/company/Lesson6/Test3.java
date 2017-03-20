package com.company.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 19.09.2016.
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String [5];

        for (int i = 0; i < s.length; i++){
            s[i] = reader.readLine();

        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
