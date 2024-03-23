

// This program is used to identify character is an alphabet or not.
// We check whether the character defined by user falls under alphabets range defined in conditions.

import java.util.Scanner;
public class CheckAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        // Taking input from the user
        char ch = sc.next().charAt(0);
        // Checking whether the character comes under alphabets

        if ((ch >='A' && ch<='Z') || (ch>='a' && ch <='z') )

        {
            System.out.println(ch + " is an alphabet");
        }

        else 
        {
            System.out.println(ch + " is not an alphabet");
        }

    }
}
