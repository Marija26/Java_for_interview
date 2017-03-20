package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 03.09.2016.
 */
public class BR03 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            String name1 = reader.readLine();
            String name2 = reader.readLine();

            System.out.println(" " + name + " получает" + " " + name1 + " через" + " " + name2 + " лет");



                }
                }
