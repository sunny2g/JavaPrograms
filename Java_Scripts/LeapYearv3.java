

// Checking a leap year or not using ternary operator

import java.util.Scanner;

public class LeapYearv3{

    public static void main (String[] args) {

        // initializaing the variable for taking input value.


        int y;
        boolean temp;
        Scanner sc = new Scanner(System.in);

        // Enetring the year user wants to check.

        System.out.println("Entering the year we want to check" );

        y= sc.nextInt();
        sc.close();

        // checking leap year or not using ternary operator.

        temp = (y % 100 == 0 ) ? ( (y % 400 == 0 ) ? true : false) : ( (y % 4 == 0)  ? true : false );

        if (temp==true) {
            System.out.println("\n" + y + " is a leap year.");
        }else {
            System.out.println("\n"  + y + " is not a leap year.");
        }

    }
}


