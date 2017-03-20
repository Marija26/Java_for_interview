package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 17.10.2016.
 * abc
 * 3
 *
 * abc
 * abc
 * abc
 */
public class Class3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine();
        int a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < a ; i++) {
            System.out.println(b);

        }

    }
}
