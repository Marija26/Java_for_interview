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
        double a = Integer.parseInt(reader.readLine());
        System.out.println(sqq((int) a));

    }

    public static double sqq(int x) {
        double num = 1;
        double rez = 0;
        while (x > 0) {
            x -= num;
            num += 2;
            if(x<0) return 0;
            else return 1;
//            rez += (x < 0) ? 0 : 1;
        }
        return rez;
    }
}

