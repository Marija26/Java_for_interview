package com.company.TestFromQizful;

import com.company.OOP.DeBug;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Маша on 18.03.2017.
 */
/*For a = [1, 3, 5, 6, 1, 4, 3, 6], the output should be
        findTheNumbers(a) = [4, 5];
        For a = [4, 5, 6, 5, 3, 4], the output should be
        findTheNumbers(a) = [3, 6]*/
public class Test7 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 1, 4, 3, 6};

        for (int i : findTheNumbers(a)) {
            System.out.println(i);

        }
    }


    static int[] findTheNumbers(int[] a) {
        List<Integer> list = new ArrayList<>(); // 1 1 2 2 3 4

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count == 1) {
                list.add(a[i]);

            }

        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    abstract class A {

        int a = 8;

        public A() {
            show();
        }

        abstract void show();

    }

    class B extends A {

        int a = 90;

        void show() {
            // System.out.println("" + a);
        }
    }
}





   










