package com.company.Lesson20;

/*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
FileInputStream - поток для чтения с файла
FileOutputStream - поток для записи в файл
*/

import java.io.*;

public class Ckass2File {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        String filename1 = reader.readLine (); // path InputStream
        String filename2 = reader.readLine (); // path OutputStream

        InputStream inputStream = new FileInputStream (filename1);
        OutputStream outputStream = new FileOutputStream (filename2);

        int count = 0;
        while(inputStream.available () > 0){

            int data = inputStream.read (); // читает один байт с потока(файла)
            outputStream.write (data);      // записывает один байт в поток для записи(файл)

            count++;
        }

        System.out.println ("Copies byte: " + count);

        inputStream.close ();
        outputStream.close ();
    }
}
