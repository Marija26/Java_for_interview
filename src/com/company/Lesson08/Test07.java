package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by ПК on 26.09.2016.
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

            
        }
    }

