
// Checking Leap Year using logical operators

// Logic: 
    // >> Enter an year 
    // >> Take a Boolean value
    // >> In if condition we are using logical operator to check leap year.
    // >> if condition (y%4==0 && y%100!=0 && y%400==0)  satifies then leap year.

import java.util.Scanner;

public class LeapYearv2 {

    public static void main (String[] args) {
        // Initializing the variable for entering the year value.
        int y;
        Scanner sc = new Scanner(System.in);
        // Entering the year we want to check.
        System.out.println("Enter the year we want to check ");
        y=sc.nextInt();
        sc.close();

        // checking leap year or not using logical operators.
        // If its divisible by 4 and not divisible by 100 its a leap year e.g., 2016
        // If its divisible by 4 and divisible by 400 as well then its leap year e.g., 1700
         
        if (y%4==0 && (y%100!=0 || y%400==0)) {
            System.out.println("\n" + y + " is a leap year");
        } else {
            System.out.println("\n" + y + " is not a leap year.");
        }

    }
}


