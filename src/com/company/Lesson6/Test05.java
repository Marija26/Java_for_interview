package com.company.Lesson6;

/**
 * Created by ПК on 19.09.2016.
 */
public class Test05 {
    public static void main(String[] args) {
        int[] n = {6, -2, 56, -4, 48, -17, 45, -57};

        int min = n[0];

        for (int i = 0; i < n.length; i++) {
           if(n[i] < min){
               min = n[i];
           }
        }

        System.out.println(min);
    }
}
