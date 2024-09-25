package se.elijah.games;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //objects

        //Player player2 = new Player("Tony");


        Scanner scanner = new Scanner(System.in); //to taking information.
        Random random = new Random();


        System.out.println(" Welcome to game "); //Welcome message

        // Getting Player 1's name
        System.out.println(" Enter player 1's name ");
        String playerOneName = scanner.nextLine();// to scan in 4rm user
        Player player1 = new Player(playerOneName); //declare 1 players

        // Getting Player 2's name
        System.out.println(" Enter player 2's name ");
        String playerTwoname = scanner.nextLine();
        Player player2 = new Player(playerTwoname); //declare 2 player object


        //Player1 roll dice
        System.out.println(player1.getName() + " 's turn to roll the dice: ");
        int player1Roll1 = random.nextInt(6) + 1;
        int player1Roll2 = random.nextInt(6) + 1;
        int player1total = player1Roll1 + player1Roll2;


        System.out.println(player1.getName() + " rolled: " + player1Roll1 + " and " + player1Roll2);
        System.out.println(player1.getName() + " 's total score: " + player1total);


        //player2 roll dice
        System.out.println(player2.getName() + " 's turn to roll the dice:");
        int player2Roll1 = random.nextInt(6) + 1; //första dic roll and intials variable to roll dice.
        int player2Roll2 = random.nextInt(6) + 1; // andra dice roll
        int player2total = player2Roll1 + player2Roll2; // total 2 dic roll


        System.out.println(player2.getName() + " rolled: " + player2Roll1 + " and " + player2Roll2);
        System.out.println(player2.getName() + " 's total score: " + player2total);

// to determine the winner. we use condition.
        if (player1total > player2total) {
            System.out.println(playerOneName + " wins with" + player1total + " points ");

        } else if (player2total > player1total) {
            System.out.println(playerTwoname + " wins with " + player2total + " points ");


        } else {
            System.out.println(" It's a draw, play again ! " + player1total + " points ");
        }
        scanner.close();

    }
}
