package com.company.Lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 10.11.2016.
 * Throwable - checked
 * - Exception - checked
 * RuntimeException - unchecked
 * IOException - checked
 * - Error - unchecked
 */
public class Class05 {
    public static void main(String[] args) throws IOException {
        max ();

        System.out.println ("Ok");
        System.out.println ("Ok");
        System.out.println ("Ok");
        System.out.println ("Ok");

    }

    public static void max() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine());
    }


}
