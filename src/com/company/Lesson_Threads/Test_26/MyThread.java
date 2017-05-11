package com.company.Lesson_Threads.Test_26;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 10.05.2017.
 */
/*
1. В выполняющем классе создать BufferedReader
2. В выполняющем классе создать статик переменную byte countReadStrings
3. Создать класс ReaderThread, сделать его нитью
3.0  Нить должна запускаться сразу при создании
3.1. Каждая нить должна читать с консоли слова. Используйте BufferedReader reader.
3.2. Используй static byte countReadStrings, чтобы посчитать, сколько слов уже считано с консоли всеми нитями.
3.3 Реализуйте логику метода run:
3.4. Пока нить не прервана (!isInterrupted) читайте с консоли слова и добавляйте их в поле List<String> result.
3.5. Используй countReadStrings для подсчета уже считанных с консоли слов.
3.6 Переопределить метод toString(), он должен выводить значение result у текущей нити
4. В выполняющем методе создать переменную int count (к-во строк, которые необходимо ввести всем нитям),
 присвоить ей значение введенное с консоли
4.1 В выполняющем методе создать 3 нити
4.2 Нити должны работать, пока count > countReadStrings, после этого остановить все дочерние нити
4.3 Вывести значение каждой нити на экран в виде: "#1:" + нить
*/
public class MyThread {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static  byte countReadStrings;
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(reader.readLine());


        for (int i = 0; i <count ; i++) {
            ReaderThread.result.add(reader.readLine());

        }
        ReaderThread readerThread = new ReaderThread("ert");
        ReaderThread readerThread1 = new ReaderThread("tyu");
        ReaderThread readerThread2 = new ReaderThread("vbn");


            while (count <= countReadStrings){

            }
            readerThread.interrupt();
            readerThread1.interrupt();
            readerThread2.interrupt();

         System.out.println("#1:" + readerThread);
         System.out.println("#2:" + readerThread1);
         System.out.println("#3:" + readerThread2);


        }





    }

