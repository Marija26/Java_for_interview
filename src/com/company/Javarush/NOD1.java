package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 19.01.2017.
 */
public class NOD1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        System.out.println (NOD(a, b));

    }
    public static int NOD(int a, int b){
        int i = 1;
        int c = 0;
        while (i<=a&&i<=b){
            if(a%i==0&&b%i==0){
                c = i;
                i++;
            }
            else i++;
        }

        return c;
    }
}
