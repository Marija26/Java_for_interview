package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 01.09.2016.
 */
public class BufRead {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String name = "Kolya";
//        System.out.println(name);

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        System.out.println("Your name " + name1);
        System.out.println("Your name " + name2);

        String y = reader.readLine();
        int number = Integer.parseInt(y);

        System.out.println(y.length());
        System.out.println(number+number);

    }
}
