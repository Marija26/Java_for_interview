package com.company.OOP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 23.01.2017.
 */
/* Разные методы для разных типов
0. Создать метод print и перегрузить его для разных типов:
- print( Double value ), должен выводит на экран надпись "Это тип Double, значение " + value
- print( String value ), должен выводит на экран надпись "Это тип String, значение " + value
- print( short value ), должен выводит на экран надпись "Это тип short, значение " + value
- print( Integer value ), должен выводит на экран надпись "Это тип Integer, значение " + value
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/
public class OverLoad {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        while (true) {
            String s = reader.readLine ();
            try {
                if (s.equals ("exit"))
                    break;
                else if (s.contains ("."))
                    System.out.println ( print (Double.parseDouble (s)));
                else {
                    int x = Integer.parseInt (s);

                    if (x > 0 && x < 128) {
                        System.out.println (print ((short) x));
                    } else System.out.println (print ((Integer)x));
                }

            } catch (NumberFormatException n) {
                System.out.println (print (s));
            }
        }
    }




    static String print(double value){

        return "Это тип Double, значение " + value;

    }
    static String print(String value){
        return "Это тип String, значение " + value;

    }
    static String print(short value){
        return "Это тип short, значение " + value;

    }
    static String print(Integer value){
        return "Это тип Integer, значение " + value;
    }

}
