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
        for (int i : findTheNumbers(a)) {
            System.out.println(i);
        }
    }


    static int[] findTheNumbers(int[] a) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(a);

        for (Integer arrayElement : a) {
            if (set.contains(arrayElement)) {
                set.remove(arrayElement);
            } else set.add(arrayElement);
        }

        int[] arrRes = {(int) set.toArray()[0], (int) set.toArray()[1]};
        return arrRes;
//        int[] b = new int[set.size()];
//        int i = 0;
//        for (Integer integer : set) {
//            b[i] = integer;
//            i++;
//        }


    }
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

//return array;





















