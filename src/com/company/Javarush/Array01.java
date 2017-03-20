package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 01.11.2016.
 */
public class Array01 {
    //1. Создать массив на 10 строчек.
//2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
// 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] list = new String[10];
            for (int i = 0; i < list.length; i++) {
                list[i] = reader.readLine();


            }
            for (int i = 0; i < 8; i++) {

            }

            for (int i = 9; i >= 0; i--) {


                System.out.println(list[i]);
            }

        }
    }
