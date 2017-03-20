package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 26.12.2016.
 */

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

public class EqualsNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine ();
        String s1 = reader.readLine ();
        if (s.equals (s1)) {
            System.out.println ("Имена идентичны");
        }
        else if(s != s1 && s.length () == s1.length ()) {
            System.out.println ("Длины имен равны");

        }

    }
}
