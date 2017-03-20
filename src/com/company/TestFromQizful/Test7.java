package com.company.TestFromQizful;

import com.company.OOP.DeBug;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        a(a);
    }

    static void a(int[] a) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer>  list3 = new ArrayList<>();
        int b = 0;
        for (int i : a) {
            if (!list1.contains(i)) {
                list.add(i);
            }
//            if (!list1.contains(i) || !list.contains(i)) {
//                list3.add(i);
//            }
            list1.add(i);
//

        }
        for (Integer integer : list) {
            System.out.println(integer);

        }

    }

}

