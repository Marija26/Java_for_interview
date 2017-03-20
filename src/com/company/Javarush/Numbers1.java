package com.company.Javarush;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 06.01.2017.
 */
/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/
public class Numbers1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt (reader.readLine ());
        int b = Integer.parseInt (reader.readLine ());
        int c = Integer.parseInt (reader.readLine ());
        if(a>0&&b>0&&c>0){

            System.out.println ("количество отрицательных чисел: 0");
            System.out.println ("количество положительных чисел: 3");}
        else if(a>0&&b>0) {
            System.out.println ("количество отрицательных чисел: 1");

            System.out.println ("количество положительных чисел: 2");}
        else if(a>0&&c>0) {
            System.out.println ("количество отрицательных чисел: 1");
        System.out.println ("количество положительных чисел: 2");}
        else if(b>0&&a>0) {
            System.out.println ("количество отрицательных чисел: 1");
            System.out.println ("количество положительных чисел: 2");}
        else if(b>0&&c>0){
            System.out.println ("количество отрицательных чисел: 1");
        System.out.println ("количество положительных чисел: 2");}
        else if(a>0){
            System.out.println ("количество отрицательных чисел: 2");
        System.out.println ("количество положительных чисел: 1");}
        else if(b>0){
            System.out.println ("количество отрицательных чисел: 2");
        System.out.println ("количество положительных чисел: 1");}
        else if(c>0) {
            System.out.println ("количество отрицательных чисел: 2");
            System.out.println ("количество положительных чисел: 1");}


        else if(a<0&&b<0&&c<0) {
            System.out.println ("количество отрицательных чисел: 3");
            System.out.println ("количество положительных чисел: 0");
        }
    }
}
