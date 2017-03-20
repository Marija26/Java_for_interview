package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 17.10.2016.
 */
public class Class6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] ar = new String[5];
        for (int i = 0; i < ar.length ; i++) {
            ar [i] = reader.readLine();
            System.out.println(ar[i]);
        }


    }
}
