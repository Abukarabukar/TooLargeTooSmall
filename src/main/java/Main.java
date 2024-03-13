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
    public static void main(String[] args){

        // Scanner
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(500 * Math.random());

        // Number of try
        int trys = 5;
        int i;
        int guess;

        System.out.println("Guess number from 1 => 20. You have 5 chances");
        System.out.println("Start");

        for (i = 0; i < trys; i++) {



            //Input from user to guess
           guess = sc.nextInt();
//           trys--;


           //if number is correct
           if (number == guess) {
                System.out.println("Bengo! you got the number");

                //we need to stop this loop
               break;

               //check the number is less than
                    } else if (number < guess && i != trys - 1) {
               System.out.println("Too large. " + "You have " + (trys - i - 1) + " trys left" );
               System.out.println("Try Again" );

           }
           else if (number > guess && i != trys - 1) {
               System.out.println("Too small. " + "You have " + (trys - i - 1) + " trys left" );
               System.out.println("Try Again" );

           }

        }

        if (i == trys){
            System.out.println("You ran out of trys");

            System.out.println("The correct number was " + number);
        }
      
    }
}
