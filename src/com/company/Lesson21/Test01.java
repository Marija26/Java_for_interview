package com.company.Lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 28.12.2016.
 */// 10 5
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        NOD(a, b);

    }

    public static void NOD(int a, int b) {
        int c = 1;
        int i = 1;
        while (a >= i && b >= i) {
            if (a % i == 0 && b % i == 0) {
                c = i;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println (c);
    }
}
