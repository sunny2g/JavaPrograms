import java.util.*;


class Testing {

public static void main(String[] args){
	
	// defining the scanner object first
	Scanner scanner = new Scanner(System.in);
	
	// asking user's name and storing in name variable
	System.out.printf("What is your name? \n");
	String name = scanner.nextLine();
	
	// asking user's age and storing it in age variable
	System.out.printf("Hello %s. How old are you?\n",name);
	int age = scanner.nextInt();
	
	// complimenting user 
	System.out.printf("%d is an excellent age to start programming. What language do you prefer?\n", age);
	scanner.nextLine();
	String language = scanner.nextLine();
	
	//compliment again
	System.out.printf("%s is a very popular language",language);
	
	scanner.close();
	
}
}