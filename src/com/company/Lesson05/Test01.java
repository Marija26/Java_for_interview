package com.company.Lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 15.09.2016.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > b && a > c) {
            System.out.println("Max is " + a);
        }
        if (b > a && b > c) {
            System.out.println("Max is " + b);
        }
        if (c > b && c > a) {
            System.out.println("Max is " + c);
        }

    }

}
