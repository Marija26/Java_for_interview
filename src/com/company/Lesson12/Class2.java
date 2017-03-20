package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 24.10.2016.
 */
/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
N = 5
M = 2

a
b
c
d
e

c
d
e
a
b
*/
public class Class2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> array = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());


        for (int i = 0; i < n ; i++) {
            array.add(reader.readLine());
        }
        for (int i = 0; i < m ; i++) {
            array.add(array.remove(0));
        }
        for (int i = 0; i <array.size() ; i++) {
            System.out.println(array.get(i));
        }
    }

}
