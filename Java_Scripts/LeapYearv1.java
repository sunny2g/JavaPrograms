
// Java Program to Check Leap Year.

// Concept > Earth takes 365.25 days to orbit around the sun called solar year.
// We always round up the no. of days in calender to 365 and we add 4 partial days to count it to one day, 
// then we add one day to our calender in every four year. and call it leap year.
 
// Logic > If a year is not a multiple of 4, it is not a leap year. 
// If it is a multiple of 4, but not a multiple of 100, it is a leap year.

import java.util.Scanner;

public class LeapYearv1{

    public static void main (String[] args) {
        
        int y;
        Scanner sc = new Scanner(System.in);
        // entering the year to check
        System.out.println("Enter the year to check for leap year");

        y= sc.nextInt();
        sc.close();
        // initializing the boolean value
        boolean leap = false;
        // checking year is divisable by 4 or not
        
        if (y % 4 == 0) {
            // checking if year is divisible by 100 or not.
            if (y % 100 == 0 ) {
                // checking if divisable by 400 or not

                if (y % 400 == 0) {
                    leap = true;
                } else {
                    leap=false;
                    }

            } else {
                        leap=true;
                    }
        } else {
            leap=false;
        }

        // printing the result

        if (leap == true) {
            System.out.println("\n" + y + " is a Leap Year.");
        } else {
            System.out.println("\n" + y + " is not a Leap Year.");
        }



        
    }
}