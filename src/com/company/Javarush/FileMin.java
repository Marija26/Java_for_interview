package com.company.Javarush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 19.12.2016.
 */
//Ввести с консоли имя файла
//Найти максимальный байт в файле, вывести его на экран.
//Закрыть поток ввода-вывода
public class FileMin {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String file = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream (file);
        int max = fileInputStream.read ();
        while(fileInputStream.available () >0) {
            int data = fileInputStream.read();
            if (data > max){
                max = data;
            }
        }
        System.out.println (max);
        reader.close ();
        fileInputStream.close ();


    }
}
