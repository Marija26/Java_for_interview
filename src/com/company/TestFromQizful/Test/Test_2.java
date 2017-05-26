package com.company.TestFromQizful.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Маша on 26.05.2017.
 */
/*
Задача   2
Задание Задан массив, элементами которого являются произвольные целые числа. Необходимо
 определить (максимально оптимальным образом) элемент с индексом k для массива,
  состоящего из таких же чисел, но отсортированного по возрастанию. Например, для
  массива   [6,   1,   4,   1,   7]   и   k=3
  правильным   ответом   будет   число   4   ([1,   1,   4,   6,   7]).
Входные   данные Массив   произвольных   целых   чисел   и   натуральное
 число   k   (1   <=   k   <=   длина   массива).
Выходные   данные k-й элемент массива, состоящего из таких же чисел, как и исходный массив, но
  отсортированного   по   возрастанию.
 */
public class Test_2 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(6);
//        list.add(1);
//        list.add(4);
//        list.add(1);
//        list.add(7);
      int[] array = {3,   2,   7,   4,   8};
        int k = 3;
        int q =0;
        for (int i = 0; i <array.length ; i++) {
            q =array[k-1];
        }
        System.out.println(q);
        System.out.println(sort(array, k));

    }

    public static int sort(int[]a, int k) {
        Arrays.sort(a);
        int res = 0;
            for (int i= 0; i < a.length; i++) {
               res = a[k-1];

            }
            k = res;
            return k;
        }
    }

