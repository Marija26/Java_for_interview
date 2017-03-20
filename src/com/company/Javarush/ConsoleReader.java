package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 15.12.2016.
 */

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/
public class ConsoleReader {
    public static void main(String[] args) throws IOException {

        System.out.println ( readString());
        System.out.println (readInt());
         readDouble();
        System.out.println (readBoolean());



    }
    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine();
        return s;
    }
    public static int readInt() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt(reader.readLine());
        return a;

    }
    public static double readDouble() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        double d = Integer.parseInt (reader.readLine());
        return d;

    }
    public static boolean readBoolean() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine ();
        if (s.equals ("true")) return true;
        else if (s.equals ("false")) return false;
        return false;


    }


}
