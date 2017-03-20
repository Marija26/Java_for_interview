package com.company.Javarush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 19.12.2016.
 */
//Ввести с консоли имя файла
//Найти байт или байты с максимальным количеством повторов
//Вывести их на экран через пробел.
//Закрыть поток ввода-вывода
public class FileOften {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String file = reader.readLine ();
        FileInputStream input = new FileInputStream (file);



        }



    }





