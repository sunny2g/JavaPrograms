import java.util.Scanner;


class Calculator {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

boolean userChoice; 
userChoice=true;
System.out.println("Hi, lets crunch some numbers");

while (userChoice){

System.out.println("Enter first number: ");
double firstNumber = scan.nextDouble();

System.out.println("Enter second number: ");
double secondNumber = scan.nextDouble();

System.out.println("Enter operator: \n\t 1. Addition \n\t 2. Substraction \n\t 3. Multiplication \n\t 4. Division");
int operator = scan.nextInt();

switch (operator){
	
	case 1:
	System.out.println("You have asked for addition  of " + firstNumber + " and " + secondNumber);
	System.out.printf("Result: %f + %f = %f\n",firstNumber,secondNumber,firstNumber + secondNumber);
	break;
	case 2:
	System.out.println("You have asked for Substraction of " + firstNumber + " and " + secondNumber);
	System.out.printf("Result: %f - %f = %f\n",firstNumber,secondNumber,firstNumber - secondNumber);
	break;
	case 3:
	System.out.println("You have asked for Multiplication  of " + firstNumber + " and " + secondNumber);
	System.out.printf("Result: %f * %f = %f\n",firstNumber,secondNumber,firstNumber * secondNumber);
	break;
	case 4:
	System.out.println("You have asked for Division  of " + firstNumber + " and " + secondNumber);
	System.out.printf("Result: %f / %f = %f\n",firstNumber,secondNumber,firstNumber / secondNumber);
	break;
	default:
	break;
} 
if (userChoice=true){
	System.out.println("Do you want to \n\t1.Continue \n\t2. Stop");
	scan.nextLine();
	String choice = scan.nextLine();
	
if (choice.equals("2")){
		userChoice=false;
		System.out.println("Bye, See you again");
}
} 	
}
}
}