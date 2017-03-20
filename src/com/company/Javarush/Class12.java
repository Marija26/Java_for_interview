package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 26.10.2016.
 */
/* 1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
 Артем Воров:  Пять наибольших чисел

Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел
*/
public class Class12 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = getIntegerList();
        System.out.println(getMinimum(list));

    }


    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(reader.readLine()));
        }

        return arr;
    }

    public static int getMinimum(List<Integer> wer) {
        int min = wer.get(0);

//        for (Integer x : wer) {
//            if (x < min) min = x;
//        }

        for (int i = 0; i < wer.size(); i++) {
            if (wer.get(i) < min) min = wer.get(i);
        }


        return min;

    }


}









