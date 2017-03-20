package com.company.Lesson_Threads.Test_15;

/**
 * Created by Маша on 09.03.2017.
 */
public class Runway {
    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        synchronized (this) {
            this.thread = thread;
        }
    }

}
