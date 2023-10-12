import java.util.Scanner;

public class Numguess{
    public static void main(String[] args)
    {
        Scanner game = new Scanner(System.in);

            playGame(game);
        
    }

     static void playGame(Scanner game) 
     {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Let's play a game. I've picked a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) 
        {
            System.out.print("Enter your guess: ");
            guess = game.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Try higher.");
            } else {
                System.out.println("Try lower.");
            }

            if (attempts == 8) {
                System.out.println("Sorry, you've used all your attempts.");
                System.out.println("The correct number was " + targetNumber + ".");
                break;
            }
        } 
    }
}

