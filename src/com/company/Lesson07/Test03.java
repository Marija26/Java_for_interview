package com.company.Lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 22.09.2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] s = new int[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = Integer.parseInt(reader.readLine());
            System.out.println(s[i]);
        }

    }

}
