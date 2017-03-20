package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 20.10.2016.
 */
//Удаление всех чисел больше 5
public class Class6 {
    public static void main(String[] args) throws IOException {
        List<Integer>ar = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            ar.add(Integer.parseInt(s));
        }

        for (int i = 0; i <ar.size() ; ) {
            int x = ar.get(i);
            if (x > 5) ar.remove(i);
            else i++;
        }

        System.out.println(ar);

    }

}
