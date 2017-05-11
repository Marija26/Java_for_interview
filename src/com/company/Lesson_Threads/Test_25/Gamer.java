package com.company.Lesson_Threads.Test_25;

/**
 * Created by Маша on 09.05.2017.
 */
public class Gamer extends Thread {
    private int rating;

    public Gamer(String name, int rating) {
        super(name);
        this.rating = rating;

    }

    @Override
    public void run() {
        try {
            while (!OnlineGame.isWinnerFound) {
                int i;
                int stepSize = OnlineGame.steps.size();
                for (i = 0; i < stepSize; i++) {
                    if (i == stepSize - 1) {
                        System.out.println(getName() + "winner is found");
                        OnlineGame.isWinnerFound = true;
                    }
                    System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                    Thread.sleep(1000 / rating);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " : " + "looser!");
        }
    }
}










