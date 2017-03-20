package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 26.12.2016.
 * Создать список, заполнить его на 5 чисел и сделать сортировку в возростающем порядке
 */
public class TestSortList {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(1);
            list.add(9);
            list.add(11);
            list.add(17);
            list.add(10);

            sort(list);


        }


    }

    public static void sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }


            }
        }
        for (Integer integer : list) {
            System.out.println(integer);

        }


    }
}

