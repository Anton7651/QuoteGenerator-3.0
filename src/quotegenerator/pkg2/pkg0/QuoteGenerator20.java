/*
 * Anton dela Cruz
 * November 1, 2018
 * This program will generate inspiring quotes every time the user presses
 */

package quotegenerator.pkg2.pkg0;

import java.util.Scanner;
/**
 *
 * @author andel7651
 */
public class QuoteGenerator20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        int choice;
        
        do {
        System.out.println("--------------------Quote Generator--------------------");
        System.out.println("Enter in a number between 1 to 8 to generate a very inspiring quote");
        System.out.println("Type in the number 10 to stop the program");
        
        choice = keyedInput.nextInt();
        
        String [ ] quotes = new String [8];
        
        quotes[0] = "With great power, comes great irresponsibility";
        quotes[1] = "Be nice to people, becasue I said so";
        quotes[2] = "No one has the right to judge you...except me";
        quotes[3] = "Nice hair, how did you make it come out your nose? LOL jk";
        quotes[4] = "You miss 100% of the shots you don't take (well...duh)";
        quotes[5] = "You have a nice face...I guess";
        quotes[6] = "What are you still doing here?";
        quotes[7] = "Better days are coming. they are called Saturday and Sunday";
        
        int num1 = 8;
        num1 = num1 - choice;
        
        if (choice > 8 && choice != 10) {
            System.out.println("Please enter in a number between 1 and 8");
        }
        
        else if (choice < 1) {
            System.out.println("Please enter in a number between 1 and 8");
        }
        
        else if (choice == 10) { 
           System.out.println("Goodbye!");
           System.out.println("---------------PROGRAM TERMINATED---------------");
        }
        else {
            System.out.println(quotes[num1]);
        }
                   
    }
        while (choice != 10);
}
}