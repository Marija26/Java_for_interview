package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 29.09.2016.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        List<Integer> ar = new ArrayList<>();
        List<Integer> par = new ArrayList<>();
        List<Integer> nepar = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){

            String s = reader.readLine();
            if (s.isEmpty()) break;
            ar.add(Integer.parseInt(s));

        }
        for (int i = 0; i < ar.size(); i++) {
            if(ar.get(i)%2 ==0)
                par.add(ar.get(i));
            else {
                nepar.add(ar.get(i));
            }

        }

        for (int i = 0; i < par.size(); i++) {
            System.out.println(par.get(i));

        }
        for (int i = 0; i < nepar.size(); i++) {
            System.out.println(nepar.get(i));

        }
    }
}
