package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 09.12.2016.
 */
/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/
public class TryCatch {
    public static void main(String[] args) throws IOException {
        readData ();

    }
    abstract class A {
     int a = 8;
     public A() { show(); }
     abstract void show();
 }

         class B extends A {
     int a = 90;
     void show() { System.out.println("" + a); }

             public static void main(String args[]) {
                     new B();
                 }
 }


    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        List<Integer> list = new ArrayList<> ();

        try {
            while (true) {
                String s = reader.readLine ();
                if (s.isEmpty ()) break;
                list.add (Integer.parseInt (s));


            }
        } catch (NumberFormatException e) {

            }
        for (int i = 0; i <list.size () ; i++) {
            System.out.println (list.get (i));



        }


    }
}

