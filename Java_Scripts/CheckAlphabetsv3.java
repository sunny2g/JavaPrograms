

// This program will check whether a user input is character is character or not using isAlphabet() method.

import java.util.Scanner;

public class CheckAlphabetsv3 {
	public static void main (String args []){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Character");
	// Taking an input from user
	char ch = sc.next().charAt(0);
	// Checking whether the character comes under alphabets using library function
	
	if (Character.isAlphabetic(ch))
		{
			System.out.println(ch + " is a character");
		}
		else
		{
			System.out.println(ch + " is not a character");
		}

	}

}

