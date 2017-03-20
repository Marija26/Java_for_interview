package com.company.TestFromQizful;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Маша on 16.03.2017.
 */
/*For a = [1, 2, 3, 1], the output should be
containsDuplicates(a) = true.

There are two 1s in the given array.

For a = [3, 1], the output should be
containsDuplicates(a) = false.

The given array contains no duplicates.*/
public class Test5 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(containsDuplicates(a));
    }

    static boolean containsDuplicates(int[] a) {
       List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();
        for (int i : a) {
            if (set1.contains(i)) {
                set2.add(i);
                return true;
            }
            set1.add(i);
        }
        return false;
    }

}




