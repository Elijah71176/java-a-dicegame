package se.elijah.cleancode;

import java.util.Scanner;

public class MainDiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" \n Welcome to the game ");

        //create players
        System.out.println("\n enter player 1 name ");
        Players player1 = new Players(scanner.nextLine());


        System.out.println("\n enter player 2 name ");
        Players player2 = new Players(scanner.nextLine());


        //player rolled dice

//        System.out.println("\nRolling the dice...");
//        player1.rollDice();
//        player2.rollDice();
        System.out.println("\n Let's play ");

        System.out.println(player1.getName() + " Your turn ");
        player1.rollDice();


        System.out.println(player2.getName() + " Your turn ");
        player2.rollDice();


        //Determine the winner
        System.out.println("\n Score ");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " you win with " + player1.getScore());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " You win with " + player2.getScore());
        } else {
            System.out.println(" It's a draw, play again " + player1.getScore());
        }
        scanner.close();
    }

    {


    }

}
