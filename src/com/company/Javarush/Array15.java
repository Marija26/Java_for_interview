package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 08.11.2016.
 */
/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/
public class Array15 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<String> list = new ArrayList<> ();
        for (int i = 0; i <10 ; i++) {
            list.add(reader.readLine());

        }
        list = doubleValues(list);
        for (String s : list) {
            System.out.println (s);

        }



    }
        public static List<String> doubleValues(List<String> list) {
            List<String> array = new ArrayList<> ();
            for (String s : list) {


                array.add (s);
                array.add (s);


            }
            return array;
        }

        }

