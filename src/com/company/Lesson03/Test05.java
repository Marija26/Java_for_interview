package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 07.09.2016.
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        int a = Integer.parseInt(s); //80
        int b = Integer.parseInt(reader.readLine()); //3
        int c = Integer.parseInt(reader.readLine()); //56

        int temp = 0;

        if (a > b){
            temp = a;   // temp = a = 80;

        }else if (b > a){
            temp = b;
        }

        if (c > temp){  // 56 > 80 false
            System.out.println("max = " + c);
        }else if (temp > c){ //80 > 56 true
            System.out.println("max = " + temp);
        }

    }
}
