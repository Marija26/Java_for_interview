package com.company.Lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 24.09.2016.
 */
/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

public class Test10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if ( a%2 == 0 && s.length() == 1){
            System.out.println("четное однозначное число" );

        }
        if(a%2 ==1&& s.length() == 1){
            System.out.println("нечетное однозначное число" );

        }
        if (a%2 ==0&& s.length() == 2) {
            System.out.println("четное двузначное число");

        }
        if(a%2 ==1&& s.length() == 2) {
            System.out.println("нечетное двузначное число");
        }
        if(a%2 ==0&& s.length() == 3) {
            System.out.println("четное трехзначное число");
        }
        if(a%2 ==0&& s.length() == 3) {
            System.out.println("нечетное трехзначное число");
        }









    }
}