package com.company.OOP.Task13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ПК on 30.01.2017.
 */
/* Файл в статическом блоке
1. Инициализируйте константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считайте из файла с именем Constants.FILE_NAME все строки и добавьте их по-отдельности в List lines.
3. Отловите все исключения, которые могут возникнуть в программе.
3. Закройте поток ввода методом close().
4. В выполняющем методе выводите на экран все значения списка lines.
*/
public class Task01 {
    static List lines = new ArrayList ();

    public static void main(String[] args) throws FileNotFoundException {
        for (Object line : lines) {
            System.out.println (line);
        }
        
    }

    static {
        try (BufferedReader reader = new BufferedReader (new FileReader (Constants.FILE_NAME))) {
            String n;
            while ((n = reader.readLine ()) != null) {
                lines.add (n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }


}

