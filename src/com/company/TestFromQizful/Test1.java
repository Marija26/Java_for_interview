package com.company.TestFromQizful;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Маша on 13.03.2017.
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0};

        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int q = arr.length;
        return q * (q + 1) / 2 - sum;

    }
}





//        int n = a.length;
//        int sum = ((n + 1) * n) / 2;
//        for (int i : a) {
//            sum -= i;
//        }
//        return sum;

//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] != (arr[i+1]-1)){
//                return arr[i] + 1;
//            }
//        }
//
//        if(arr[0] != 0){
//            return 0;
//        } else {
//            return arr[arr.length - 1] + 1;
//        }

//        Arrays.sort(arr);
//                int x = 0;
//                for (int i : arr) {
//                if (i != x) {
//                break;
//                }
//                x++;
//                }
//
//                return x;



