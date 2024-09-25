package se.elijah.cleancode; // package declaration

import java.util.Random; // import random to generate random nr. depends on rolling dice.

public class Players {
    // attribute here
    private String name;
    private int score;

    //constructor  2 initializes players,
    public Players(String name) {
        this.name = name;
        this.score = 0;
    }

    //getter method to proivide access d private class attri 4rm outside.
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void rollDice() {
        Random random = new Random();

        int firstroll = random.nextInt(6) + 1;
        int secondroll = random.nextInt(6) +1;
        score = firstroll + secondroll;

        //score = random.nextInt(6) + 1; //dice roll
        System.out.println(name + " Rolled " + firstroll + " and " + secondroll + " total " + score);


    }
}




