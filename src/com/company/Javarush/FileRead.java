package com.company.Javarush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ПК on 24.01.2017.
 */
/*3. Чтение файла

1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.*/
public class FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        FileInputStream in = new FileInputStream(reader.readLine());

        while (in.available()>0) {
            System.out.print((char)in.read());
        }

        in.close();
    }
    }


