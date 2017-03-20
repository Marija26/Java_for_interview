package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 08.09.2016.
 */
public class Test08 {
    public static void main(String[] args) throws Exception
    {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String s = reader.readLine();
            int a = Integer.parseInt(reader.readLine());
            int n = 0;
            while (n < a){
                System.out.println(s);
                n++;
            }
    }
}
