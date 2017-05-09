package com.company.Lesson_Threads.Test_25;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Маша on 09.05.2017.
 */
public class OnlineGame extends Thread {
    static List<String> steps = new ArrayList<>();
   boolean isWinnerFound = false;
    static {
        steps.add("Начало игры");
        steps.add("Сбор ресурсов");
        steps.add("Рост экономики");
        steps.add("Убийство врагов");
    }


}
