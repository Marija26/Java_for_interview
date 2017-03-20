package com.company.Lesson_Threads.Task_05;

import java.util.Date;

/**
 * Created by Маша on 09.02.2017.
 */
public interface MusicalInstrument extends Runnable {
    Date startPlaying();
    Date stopPlaying();

}
