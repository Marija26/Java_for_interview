package com.company.TestFromQizful;

import com.company.OOP.DeBug;
import sun.security.x509.OIDMap;

import java.lang.reflect.Array;
import java.security.Key;
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

        int[] a = {1, 3, 4, 5, 6, 1, 3, 6};

        int x = 0;
        int y= 0;
        for (int z = 0; z < 5; z++)
        {
            if (( ++x > 2 ) && (++y > 2))
            {
                x++;
            }
        }
        System.out.println(x + " " + y);
        S
    }

//        for (int i : findTheNumbers(a)) {
//            System.out.println(i);








    static int[] findTheNumbers(int[] a) {
       Set<Integer> set = new HashSet<>();
       Arrays.sort(a);

        for (Integer arrayElement : a) {
            if (!set.add(arrayElement)) {
                set.remove(arrayElement);
            }

        }
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            Integer in = list.get(i);

        }
        int[] array = new int[list.size()];
        for (int i = 0; i < set.size(); i++) {
            array[i] = list.get(i);




        }
        return array;
    }

//

//    static int[] findTheNumbers(int[] a) {
//        List<Integer> list = new ArrayList<>(); // 1 1 2 2 3 4
//
//        Arrays.sort(a);
//        for (int i = 0; i < a.length; i++) {
//            int count = 0;
//            for (int j = 0; j < a.length; j++) {
//                if (a[j] == a[i]) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                list.add(a[i]);
//
//            }
//
//        }
//
//        int[] array = new int[set.size()];
//        for (int i = 0; i < set.size(); i++) {
//            array[i] = set.get(i);
        }
        //return array;





















