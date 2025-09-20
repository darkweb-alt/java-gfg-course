package Week2;

// Java Program to Illustrate Scanner Class

// Importing Scanner class from
// java.util package
import java.util.Scanner;

// Main class
class GfG {

    // Main driver method
    public static void main(String args[]) {

        // Creating object of Scanner class to
        // read input from keyboard
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an integer");

        // Using nextInt() to parse integer values
        int a = scn.nextInt();

        System.out.println("Enter a String");
        scn.nextLine();

        // Using nextLine() to parse string values
        String b = scn.nextLine();

        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " "
                          + "and name as " + b);
    }
}