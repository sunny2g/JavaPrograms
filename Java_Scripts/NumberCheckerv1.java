

// In this program we will check whether a number is positive or negative.

import java.util.Scanner;

public class NumberCheckerv1{
    public static void main (String[] args ) {

        int num;

        // Initializing the input variable 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        sc.close();

        if (num > 0) {
            System.out.println(num + " is a positive number");

        }else if (num < 0 ) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + " is neither positive neither negative.");
        }
    }
}
