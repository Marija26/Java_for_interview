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
            findTheNumbers(a);}

       static int[] findTheNumbers(int[] a) {


        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count == 1) {
               return a[i];
            }
            Arrays.sort(a);

        }
        return a;

    }
}









