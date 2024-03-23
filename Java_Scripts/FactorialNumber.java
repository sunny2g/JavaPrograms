

// Java Program for finding factorial of a number
// Concept : Factorial is mostly used in permutation and combination. It is calculated as the product of the all positive number from 1 to n. for example if the number is N, then the factorial would be (1x2x3x....xN).
// The factorial value of 0 is '1' and there is no factorial value for negative number.

// Method 1
// By using for loop.


import java.util.Scanner;

class FactorialNumber {


	public static void main(String args []) {

	int x, f=1,n;

	// Creating object
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number :");
	n = sc.nextInt();

	// Calculating factorial value .
	for (x=1;x<=n;x++)
	{
		f=f*x;
	}

	// printing factorial value
	System.out.println("Factorial of " + n + " = " + f);

// Method 2
// By using for loop.

	System.out.println("Starting second method");
	int y=1,g=1,o;
	// creating objects
	// entering a number
	System.out.println("Enter a number :");
	o = sc.nextInt();
	sc.close();
	// Calculating factorial value . 
	while (y<=o)
	{
		g=g*y;
		y++;

	}
	// Printing factorial value.
	System.out.println("Factorial of " + o + " = " + g);


	}

}














