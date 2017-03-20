package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 06.01.2017.
 */
/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/
public class Cycle1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String s = reader.readLine ();
        int N = Integer.parseInt (s);
        int i = N;
        while (i >0){
            System.out.println (s);
            i--;
        }



        }
    }

