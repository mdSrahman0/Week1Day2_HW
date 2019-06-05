import java.util.Scanner;

/**
 * Md Rahman
 * Given a number, see if it is divisible by 3, then 5, then both.
 */

public class Week1Daily2_Divisible {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // will be necessary for asking user if they wish to continue entering numbers
        String answer = "";

        do{
            System.out.println("Please enter a number: ");
            double d = console.nextDouble();
            isDivisible(d);
            System.out.println("Would you like to enter another number? Yes or No?");
            answer = console.next();
        } while (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y"));
    } // end main

    // take the user's number, and find out if it's divisible by 3, 5, and both.
    public static void isDivisible(double d){

        // we still store as double because we want to retain any decimal numbers for when we
        // compare it's int equivalent.
        double divThree = d/3; // hold the number/3
        double divFive = d/5;  // hold the number/5

        // first we check if the value of divThree and divFive are equivalent to their integer.
        // If they are, we're done.
        if(divThree == (int)divThree && divFive == (int)divFive) {
            System.out.println("fizzbuzz");
            return;
        }

        // check if divThree is equivalent to it's integer
        if(divThree == (int)divThree){
            System.out.println("fizz");
        }

        // check if divFive is equivalent to it's integer
        if(divFive == (int)divFive){
            System.out.println("buzz");
        }

    } // end isDivisible
} // end class
