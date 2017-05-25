package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 26.12.2016.
 */
/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.

[0](List Entry1) [](List) [7](List Entry3) [8](List Entry4, Entry5) [9](List Entry2)..// 16

null - 100
10 - 100
5 - 50
20 - 200
50 - 500
10 - 200
*/
public class Class01_NOD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        System.out.println (NOD (a, b));
    }

    public static int NOD(int a, int b) {
        int i = 1;
        int c = 0;
        while(i <= a && i <= b){
            if (a%i==0 && b%i==0) {
                c = i;
                i++;
            } else i++;
        }
        return c;
    }
}

