package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 06.01.2017.
 */

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/
public class Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());

        if(a>0&&b>0&&c>0)System.out.println ("3");
        else if(a>0&&b>0) System.out.println ("2");
        else if(a>0&&c>0) System.out.println ("2");
        else if(b>0&&a>0) System.out.println ("2");
        else if(b>0&&c>0) System.out.println ("2");
        else if(a>0) System.out.println ("1");
        else if(b>0) System.out.println ("1");
        else if(c>0) System.out.println ("1");
        else if(a<0&&b<0&&c<0) System.out.println ("0");





    }



    }

