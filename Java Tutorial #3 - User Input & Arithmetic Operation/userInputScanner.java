// Made on 09/25/2023

package learningJava;

// Uses the Scanner module
import java.util.Scanner;

public class userInputScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input
		Scanner s = new Scanner(System.in);
		
		System.out.print("What is your Name: ");
		String firstName = s.nextLine();
		
		System.out.print("Where do you live: ");
		String location = s.nextLine();	
		
		System.out.print("What id your favorite letter: ");
		String character = s.nextLine();	
			
		System.out.print("What is your age: ");
		int age = s.nextInt();
		
		// Output
		
		System.out.println("Hello, I'm " + firstName + "!");
		System.out.println("My age is " + age + " years old.");
		System.out.println("I live in " + location);
		System.out.println("My favorite letter is " + '"' +character + '"');
		
		
		
	}

}
