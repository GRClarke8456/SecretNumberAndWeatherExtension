import java.util.Scanner;
import java.util.Random;

public class SecretName {
    public static void main(String[] args) {
      // First version secret number game
        System.out.println("Pick a number between 1 and 50: ");

        Scanner myInput = new Scanner(System.in);
        int guessNumber = myInput.nextInt();

        System.out.println("Your number is " + guessNumber);

        if (guessNumber == 13) {
            System.out.println("Well done, you guessed the correct number!");
        } else if (guessNumber > 13) {
            System.out.println("Sorry, that number is too big.");
        } else {
            System.out.println("Sorry, that number is too small.");
        }

        // Second version secret number game
        System.out.println("Pick a number between 1 and 50: ");

        Scanner ourInput = new Scanner(System.in);
        int guessNumber2 = ourInput.nextInt();

        Random randI = new Random();
        int secretNumber = randI.nextInt(50);

        if (guessNumber2 == secretNumber){
            System.out.println("Congratulations. You guess the secret number!");
        } else {
            System.out.println("Sorry. You didn't guess the secret number");
        }

    }
}
