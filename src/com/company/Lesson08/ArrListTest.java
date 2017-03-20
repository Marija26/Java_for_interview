package com.company.Lesson08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ПК on 26.09.2016.
 */
public class ArrListTest {

    public static void main(String[] args) {
        List<String> array = new ArrayList<>(); // String[] array = new String[-];
        int n = array.size(); // int n = array.length;
        array.add("tfyt1"); // array[0] = "fewf"; // 3
     //   System.out.println(array.get(0));  // array[0];
        array.add("tfytfwefew2");  //-
        array.add("tfytwef3"); // 5
        array.add(0, "fwefwef4"); // 2
        array.add(0, "fwefwefdqwdqwd5"); // 1
        array.add(3, "fwefwef6"); //3
        array.add(0, "fwefwef7"); // Вставка элемента, сдвигает на один индекс вперед все элементы после нашего // -
        array.set(0, "fwefew8"); // Запись элемента, замещает старое значение // 0
        array.set(5, "fwefew9"); //4
        array.remove(3);

//        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

}
