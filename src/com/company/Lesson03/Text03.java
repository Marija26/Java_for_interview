package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 05.09.2016.
 */
public class Text03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("1 - kvadrat, 2 - convert, 3 - precent, 4 - sqrT, other number - to exit");

        int number = Integer.parseInt(reader.readLine());

        switch(number){
            case 1:
                System.out.println("Enter your number: ");
                kvadrat(Integer.parseInt(reader.readLine()));
                break;
            case 2:
                System.out.println("Enter your number of USD: ");
                convert(Integer.parseInt(reader.readLine()));
                break;
            case 3:
                System.out.println("Enter your number and precent(0>1): ");
                precent(Integer.parseInt(reader.readLine()), Double.parseDouble(reader.readLine()));
                break;
            case 4:
                System.out.println("Enter your number: ");
                sqrT(Integer.parseInt(reader.readLine()));
                break;
            default:
                System.out.println("End.");
                break;
        }

    }

    public static void kvadrat (int a){
        System.out.println("Pow = " + a*a);
    }

    public static void convert (double a){
        System.out.println("UAH = " + a*26.3);
    }

    public static void precent (double a, double b){
        System.out.println("Precent = " + a*b);
    }

    public static void sqrT (double a){
        System.out.println("Sqrt of number = " + Math.sqrt(a));
    }
}
