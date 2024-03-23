

// This program is used to check whether a character provided by user is an alphabet or not using ASCII values.
// We will be using an ASCII integer value allotted for each character to check whether a character is alphabet or not.

import java.util.Scanner;
public class CheckAlphabetsv2 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        // Taking a character from user input
        char ch = sc.next().charAt(0);
        // Checking whether the characters comes under alphabets using ASCII

        if ((ch>=97 && ch <= 122) || (ch>=65 && ch <=90))
        {
            System.out.println(ch + " is an alphabet");
        }
        else {
            System.out.println(ch + " is not an alphabet");
        }
    }
    
}
