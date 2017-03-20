package com.company.OOP;

/**
 * Created by ПК on 15.12.2016.
 */

import java.io.*;

/**Запись в файл
 Прочесть с консоли имя файла.
 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
 */

public class File02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));

        String filename = reader.readLine ();
        OutputStream outputStream = new FileOutputStream (filename);

        while(true){
            String s = reader.readLine();
            if(s.equals ("exit")) {
                outputStream.write (s.getBytes ());
                break;
            }else
            outputStream.write ((s + "\n").getBytes ());
        }
    }
}
