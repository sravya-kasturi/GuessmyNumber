import java.util.Random;
import java.util.Scanner;

public class Guessmynumber {
    public static void main(String[] args) {
    
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        
        int numberOfTries = 0;

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess My Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) {
            
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            
            numberOfTries++;

    
            if (guess == numberToGuess) {
                System.out.println(" Congratulations! You guessed the number in " + numberOfTries + " tries.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
        
        }
        scanner.close();
    }
}


    

