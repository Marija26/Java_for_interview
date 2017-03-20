package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 05.09.2016.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        int number1 = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int number2 = Integer.parseInt(s2);

        if (number1 > number2){
            System.out.println("min = " + number2);
        }else if (number1 < number2){
            System.out.println("min = " + number1);

        }else if (number1 == number2){
            System.out.println("Chisla ravny ");
        }


    }
}
