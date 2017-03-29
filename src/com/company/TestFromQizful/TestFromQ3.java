package com.company.TestFromQizful;




/*For a = [6, 7, 3, 8], the output should be
  nextLarger(a) = [7, 8, 8, -1].*/

import java.util.*;

public class TestFromQ3 {

    public static void main(String[] args) {
        int[] a = {6, 7, 3, 8};


        for (int i : sort(a)) {
            System.out.println(i);

        }
    }


    static int[] sort(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                for (int j = 0; j < list.size()-1; j++) {
                    if (list.get(j + 1) > list.get(j)) {
                        list.set(j, list.get(j + 1));
                    }
            }

        }



        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;

    }
}






//    static void sort(int[] a) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {
//            list.add(a[i]);
//
//        }
//      List<Integer> list2 = new ArrayList<>();
//        int max = list.get(0);
//
//        ListIterator<Integer> listIterator = list.listIterator();
//        while (listIterator.hasNext()) {
//
//
//            for (int i = 0; i < list.size(); i++) {
//                if (listIterator.nextIndex() > list.get(i)) {
//                    max = listIterator.nextIndex();
//
//
//
//
//                }
//
//
//            }
//
//
//        }
//        System.out.println(max);
//
//
//
//    }




























