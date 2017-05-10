package com.company.Lesson_Threads.Test_25;

/**
 * Created by Маша on 09.05.2017.
 */
public class Gamer extends Thread {
    OnlineGame onlineGame = new OnlineGame();

    private int rating;


    public Gamer(String name, int rating) {
        super(name);
        this.rating = rating;
        start();
    }


    @Override
    public void run() {

        while (!onlineGame.isWinnerFound) {

            for (int i = 0; i < onlineGame.steps.size(); i++) {
                System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                try {
                    Thread.sleep(1000 / rating);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            onlineGame.isWinnerFound = true;
            if (onlineGame.isWinnerFound) {
                System.out.println(getName() + " : " + "победитель!");
                break;

            }

        }

    }
}









