package com.company.Lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 24.10.2016.
 */
/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/
public class Class1 {
    public static void main(String[] args) throws IOException {
        List<Integer>list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         while (true){
             String s = reader.readLine();
             if (s.isEmpty()) break;
             list.add(Integer.parseInt(s));

         }

//        for (int i = list.size() - 1; i >= 0 ; i--) {
//            System.out.println(list.get(i));
//        }

        for (int i = 0; i < list.size(); i++) {
            int j =  list.size() - 1 - i;
            System.out.println(list.get(j));
        }
    }

}
