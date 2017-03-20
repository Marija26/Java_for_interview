package com.company.Lesson20;

import java.io.*;

/**
 * Created by ПК on 21.11.2016.
 */
/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/
public class Class3File {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));

        InputStream inputStream = null;

        while (true){
            try{
                String input = reader.readLine ();
               inputStream = new FileInputStream (input);
                break;
            }catch (FileNotFoundException f){
                System.out.println ("Файл не существует.");
            }
        }

        String output = reader.readLine ();
        OutputStream outputStream = new FileOutputStream (output);

        int count = 0;
        while (inputStream.available () > 0) {
            int data = inputStream.read ();
            outputStream.write (data);
            count++;

        }
        System.out.println ("..." + count);
        inputStream.close ();
        outputStream.close ();


    }
}
