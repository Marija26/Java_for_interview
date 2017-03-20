package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 26.09.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            a.add(s);
        }

        for (int i = a.size() -1; i >=0 ; i--) {
            System.out.println(a.get(i));

        }

    }
}
