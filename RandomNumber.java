package Task1;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        int playerScore = 0;
        System.out.println("Welcome to the Number Guessing Number!");
        while (playAgain) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            final int MAX_ATTEMPTS = 5;
            int attempts = 0;
            boolean hasGuessedCurrectly = false;
            System.out.println("\nI have generated a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess the number.");
            while (attempts < MAX_ATTEMPTS) {
                System.out.println("Attampt " + (attempts + 1) + " Guess the number");
                int guess = sc.nextInt();
                attempts++;
                if (guess < randomNumber) {
                    System.out.println("Too low!  Try again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts");
                    hasGuessedCurrectly = true;
                    playerScore += (MAX_ATTEMPTS - attempts + 1);
                    break;
                }
            }
            if (!hasGuessedCurrectly) {
                System.out.println("Sorry! You've used all " + MAX_ATTEMPTS + " attempts.");
                System.out.println("The correct number was: " + randomNumber);
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
        System.out.println("\nThank you for playing!");
        System.out.println("Your total score is: " + playerScore);
    }

    }
