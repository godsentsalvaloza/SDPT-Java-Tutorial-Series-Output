// Made on 10/02/2023
package learningJava;

// Imports the scanner library
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// Value array
		String[] names = {"Jay", "Sentry", "Ash", "April", "Jane", "John", "Dave"};	
		
		// Asks for user input
		System.out.print("Enter the value: ");
		Scanner s = new Scanner(System.in);
		String value = s.nextLine();
		
		
		int i = 0;
		
		// Default value if no match found
		String matchCheck = "NO match found";
		
		// Logic for finding values
		while(i < names.length) {
			
			if(value.equalsIgnoreCase(names[i])) {
				matchCheck = "Found: " + names[i];
				break;
			}
			i++;
			
		}
		System.out.println(matchCheck);
			
		// End.
	}

}
