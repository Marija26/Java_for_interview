package com.company.Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 17.10.2016.
 */
public class Class2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max;
        if (a > b && a > c)
            System.out.println(a);
        if (b > c && b > a)
            System.out.println(b);
        if (c > b && c > a)
            System.out.println(c);




    }
}
