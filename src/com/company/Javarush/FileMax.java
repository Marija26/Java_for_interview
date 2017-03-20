package com.company.Javarush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 19.12.2016.
 */
public class FileMax {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String file = reader.readLine();
        FileInputStream input = new FileInputStream (file);

        int min = input.read ();


        while(input.available () > 0){
            int tmp = input.read ();
            if(tmp < min)
                min = tmp;
        }
        System.out.println (min);
        reader.close ();
        input.close ();
    }
}
