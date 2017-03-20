package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 26.09.2016.
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar = new ArrayList<>();
        while(true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int x = Integer.parseInt(s);
            if (x%2 == 0) {
                ar.add(x);
            }else if (x%2 == 1){
                ar.add(0, x);
            }


        }
        for (int i = 0; i <ar.size() ; i++) {

            System.out.println(ar.get (i));
        }
    }
}
