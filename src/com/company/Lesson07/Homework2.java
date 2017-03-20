package com.company.Lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 26.09.2016.
 */
/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
public class Homework2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int []a = new int[20];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 19; i >=0 ; i--) {
            System.out.println(a[i]);
        }

        }




    }

