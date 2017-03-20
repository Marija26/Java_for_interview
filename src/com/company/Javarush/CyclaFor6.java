package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 10.01.2017.
 */
/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/
public class CyclaFor6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine ();
        for (int i = 5; i >0 ; i--) {


            System.out.println (i);



            }
            //System.out.println (s);

        }
    }

