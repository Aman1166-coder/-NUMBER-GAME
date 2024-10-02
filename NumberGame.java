import java.util.Random;
import java.util.*;

public class NumberGame 
{
    public static void main(String[] args) 
    {
        
        Scanner  sc = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int totalRounds = 0;
        int score = 0;
        System.out.println(score);
        System.out.println("\n******** WELCOME TO THE NUMBER GAME ********");

        boolean playAgain = true;

        while(playAgain)
        {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound: " + (totalRounds + 1));
            System.out.println("\nSystem has generated a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess the number. Good Luck!");
            totalRounds++;

            while(attempts < maxAttempts && !guessedCorrectly)
            {
                System.out.println("\nAttempt: " + (attempts + 1) + "/" + attempts);
                System.out.println("Enter your guess => ");
                int userGuess = sc.nextInt();
                sc.nextLine();

                if (userGuess > generatedNumber)
                {
                    System.out.println("\nIt's too low!");
                }

                else if (userGuess > generatedNumber) 
                {
                    System.err.println("\nIt's too high!");   
                }

                else
                {
                    System.out.println("Bullseye!! You guessed the right one.");
                    guessedCorrectly = true;
                    score++;
                }

                attempts++;
            }

            if(!guessedCorrectly)
            {
                System.out.println("\nOops! You have used up all your attempts.");
                System.out.println("The corret number was; " + generatedNumber);
            }

            System.out.println("\nWould you like to play this game again? (Yes/No) => ");
            String playAgainResponse = sc.nextLine();

            if (!playAgainResponse.equalsIgnoreCase("Yes"))
            {
                playAgain = false;
            }
        }

        System.out.println("\nGame over! Your score is: + score");
        System.out.println("Thanks for playing");    
    }
}
