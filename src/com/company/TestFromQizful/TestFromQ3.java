package com.company.TestFromQizful;




/*For a = [6, 7, 3, 8], the output should be
  nextLarger(a) = [7, 8, 8, -1].*/

import java.util.*;

public class TestFromQ3 {

    public static void main(String[] args) {
        int[] a = {6, 7, 3, 8};

        sort(a);
        for (int i : a) {
            System.out.println(i);

        }

    }

    static void sort(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);

        }
      List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {

            for (int i = 0; i < list.size(); i++) {
                if (listIterator.nextIndex() > list.get(i)) {
                    list2.add();



                }

            }


        }

    }
}



























