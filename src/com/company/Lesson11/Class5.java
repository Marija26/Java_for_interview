package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 20.10.2016.
 */
//чётные числа добавляются в конец списка, нечётные – в начало.
public class Class5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ar =new ArrayList<>();
        while(true){

           String s = reader.readLine(); //5

            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0) ar.add(x);
            else ar.add(0, x);
        }

        System.out.println(ar);
    }
}
