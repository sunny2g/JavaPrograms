
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class UserListener{
		public static void main(String[] args) {

		String userName;
		String userNumber;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please type your name: ");
		userName = sc.nextLine();
		
		System.out.println("Please type your number: ");
		userNumber = sc.nextLine();
		String fileUser_Input = userName + "," + userNumber;
		System.out.println(fileUser_Input);
		
		
		try{
			File myObj = new File("filename.csv");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getAbsolutePath());
										}else {
											System.out.println("File already exists. ");
												}
			
			} catch (IOException e) {
				System.out.println("An error occured.");
				e.printStackTrace();
			}
		
		
		
		}
} 

