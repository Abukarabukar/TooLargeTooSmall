import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    private static Scanner scanner;

    //not finished yet
    public static void main(String[] args) {
        int max = 20;
        int min = 1;

        int guess = range(min, max);
        int numberOfTry = 5;
        int i;
        for (i = 1; i <= numberOfTry; i++){
            System.out.println("Guess A number from 1 => 20");

            //Object
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            if (userInput < guess){
                System.out.println("Too small " + "You have " + (numberOfTry - i));
            }

            else if (userInput > guess) {
                System.out.println("Too large " + "You have " + (numberOfTry - i));

            }

            else {
                System.out.println("Bengo! You got the number");
                break;
            }

        }

        if (i > numberOfTry){
            System.out.println("I am sorry, but you are not smart");

        }
    }
        // I need a range of number from 0 - 20; Done
        //We created a method call range and put to parameters (min, max) and we add the variable to the methods
        // and then we have to choose our return type which "int" and then we need to linked it inside the main method.
    public static int range (int min, int max) {
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
return rand;
    }



        // Establish the number; Done
        // I need loop; Done
        // count the number of guesses; Done
        // scanner: Done
        //





}
