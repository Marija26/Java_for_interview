package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 14.11.2016.
 * Throwable - checked
 * - Exception - checked
 * RuntimeException - unchecked (ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, NumberFormatException)
 * IOException - checked
 * - Error - unchecked
 */

// try
// catch
// finally
// throws
// throw
public class TestException01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int b = Integer.parseInt (reader.readLine ());
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e){
            System.out.println ("/ zero");
        }


    }

}
