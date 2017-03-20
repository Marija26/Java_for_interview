package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 01.09.2016.
 */
public class BufRead01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
        String name = reader.readLine();
        System.out.println("String is " + name);

        String name1 = reader.readLine();
        System.out.println("String is " + name1);

        String mame2 = reader.readLine();
        int number = Integer.parseInt(mame2);
        System.out.println("Number is "+ number*number);

    }
}
