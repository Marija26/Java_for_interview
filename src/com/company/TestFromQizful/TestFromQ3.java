package com.company.TestFromQizful;




/*For a = [6, 7, 3, 8], the output should be
  nextLarger(a) = [7, 8, 8, -1].*/

import java.util.*;

public class TestFromQ3 {

    public static void main(String[] args) {
        int[] a = {6, 7, 3, 4, 9};

        for (int i : sort(a)) {
            System.out.println(i);
        }
    }

    static int[] sort(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i <a.length; i++) {
            for (int j = i; j <a.length ; j++) {
                if(a[i] < a[j]){
                    result[i] = a[j];
                    break;
                } else result[i] = -1;

            }

        }



        return result;
    }
}


// static void printNextLarger(int a[]) {
//        int max = a[a.length - 1];
//        a[a.length - 1] = -1; //-1 here means none
//        for (int i = a.length - 1; i > 0; i--) {
//            if (a[i - 1] >= max) {
//                max = a[i - 1];
//                a[i - 1] = -1;
//            } else {
//                a[i - 1] = max;
//            }




























