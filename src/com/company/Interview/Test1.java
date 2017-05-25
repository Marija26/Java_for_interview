package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Маша on 25.05.2017.
 */
/*
Задача   1
Задание Необходимо вычислить квадратный корень заданного натурального числа n с округлением
вниз до ближайшего целого, не используя функций sqrt(n) и n^0.5.
Например, для числа 14
результатом будет число 3, для числа 28 – число 5.
Также необходимо привести краткую
информацию   об   используемом   алгоритме.
Входные   данные  Произвольное   натуральное   число   n.
Выходные   данные Квадратный   корень   заданного   числа,   округлённый   вниз   до   ближайшего   целого.*/
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());
        System.out.println(number(c));
    }

    public static int number(int c) {
        int a = 1;
        while(a>0){
        c =a* a ;

    }
        return c;

}

