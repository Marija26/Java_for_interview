package com.company.Lesson07;

/**
 * Created by ПК on 22.09.2016.
 */
public class Test05 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, -5, 14, -5};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];

            }

        }
        System.out.println(min);

    }
}
