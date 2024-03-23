
// This program will return sum of natural numbers using while loop

import java.util.Scanner;

class SumNatural {


	// Defining a user function to calculate the sum using recursion
	
	public static int sumNumbers(int numR){

		// Recursive function
		if (numR !=0 ) {
			return numR + sumNumbers(numR - 1);
		} else {
			return numR;
		}
	}


	// Defining a user function to get the sum of natural numbers between a range using an user defined function(do-while loop)
	

	public static int sumNumbersDoWhile(int lowerRange,int upperRange)
	{
		int sumDoWhile = 0 ;
		do {
			sumDoWhile += lowerRange++;

		}while (lowerRange != upperRange);
		return sumDoWhile;
	}

	// Defined main function here.
	
	public static void main(String args []) {
	
		System.out.println("Enter the first last element for while loop") ;
		// Taking input from user

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=0, sum=0;
		while (i <= num)
		{
			// Iterating the counter for each iteration
			// and adding the value to the previously existing sum.
			sum += i ;
			i++ ;
		}

		System.out.println("The Sum of Natural numbers including " + num + " is " + sum);

	
		// Second way 
		// Sum of natural numbers using for loop
		
		System.out.println("Enter the second last element 4 for loop");
		// Taking the second input from user
		
		int num2 = sc.nextInt();
		int sum2=0;

		for (int j=1;j<=num2;j++)
		{
			
			// adding the iterator value to the previously existing sum.
			sum2 +=j;
			
		}
	

		System.out.println("The sum of natural numbers including " + num2 + " is " + sum2);


		//Third way
		// We can find the sum of natural numbers using maths formula
		// Sum = n(n+1)/2

		System.out.println("Enter the last element");

		// Taking input from user

		int num3 = sc.nextInt();

		// Using the maths formula to calculate the sum.

		int sum3 = num3 * (num3 + 1) / 2;

		System.out.println("The sum of natural numbers including " + num3 + " is " + sum3);


		// Fourth way
		// Sum of natural numbers using recursion.
		// Already defined a user function outside main function with name sumNumbers.

		System.out.println("Enter the last element for recursion menthod");

		// Taking input from user
		int numR = sc.nextInt();
		// Using recursive function to calculate the sum
		System.out.println("The sum of natural numbers including " + numR + " is " + sumNumbers(numR));

			
		// int lowerRange = 10, upperRange = 90;
		System.out.println("Enter lowerRange number");
		int lowerRange = sc.nextInt();
		System.out.println("Enter upperRange number");
		int upperRange = sc.nextInt();

		System.out.println("The sum of natural numbers from " + lowerRange + " and " + upperRange + " is " + sumNumbersDoWhile(lowerRange,upperRange));



	}

}



