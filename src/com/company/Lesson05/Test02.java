package com.company.Lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 15.09.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());


        if (a > b && a > c && a > d){
            System.out.println("max is " + a);
        }
        if (b > a && b > c && b > d){
            System.out.println("max is " + b);

        }
        if (c > a && c > b && c > d){
            System.out.println("max is " + c);
        }
         if (d > a && d > b && d > c){
             System.out.println("max is " + d);
         }
    }

}
