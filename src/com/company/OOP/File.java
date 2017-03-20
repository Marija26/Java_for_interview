package com.company.OOP;

import java.io.*;

/**
 * Created by ПК on 15.12.2016.
 */
/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/
public class File {
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

        while(inputStream.available () > 0){
            System.out.println ((char)inputStream.read ());
        }

        inputStream.close ();
    }

    }

