package com.company.TestFromQizful.Test;

import java.io.*;

/**
 * Created by Маша on 18.05.2017.
 */
/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/
public class File1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = null;
        while(true) {
            try {
                String a = reader.readLine();
                fileInputStream = new FileInputStream(a);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File is not found");

            }
        }

        String b = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(b);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

}




