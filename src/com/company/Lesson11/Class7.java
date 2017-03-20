package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 20.10.2016.
 */
//Разделение массива на два – чётных и нечётных чисел
public class Class7 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s = reader.readLine();
            if (s.isEmpty())break;
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i <list.size() ; i++) {
            int x = list.get(i);
            if (x % 2 == 0)
                even.add(list.get(i));
            if (x % 2 ==1)
                odd.add(list.get(i));

        }

        for (int i = 0; i < even.size(); i++) {
            System.out.println(even.get(i));
        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
        }

    }
}
