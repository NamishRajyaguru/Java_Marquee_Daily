//Number guessing game

import java.util.Scanner;

public class NumberGuessingGame {
    public static void playGame() {
        int targetNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
        while (guess != targetNumber) {
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                
                if (guess > targetNumber) {
                    System.out.println("Too high");
                } else if (guess < targetNumber) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Stop when correct");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); 
            }
        }
        
        scanner.close();
    }

    public static void main(String[] args) {
        playGame();
    }
}


