package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 07.09.2016.
 */
public class Rest08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers: ");
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);

        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);

        if(a < b && b < c){
            System.out.println(b);
        }
        if(a < c && c < b){
            System.out.println(c);
        }
        if(c < a && a < b){
            System.out.println(a);
        }
        if(c < b && b < a){
            System.out.println(b);
        }
        if(b < c && c < a){
            System.out.println(c);
        }if(b < a && a < c){
            System.out.println(a);
}   }    }
