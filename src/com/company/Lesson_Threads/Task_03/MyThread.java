package com.company.Lesson_Threads.Task_03;

import java.lang.*;

/**
 * Created by Маша on 09.02.2017.
 */
/* My second thread
1. Создать public static класс TestThread унаследовавшись от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread".
3. Метод run должен выводить в консоль "it's run method".
*/
public class MyThread {
    public static void main(String[] args) {
      Thread thread = new Thread();
      thread.start();

    }
}
