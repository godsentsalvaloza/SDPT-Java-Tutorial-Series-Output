// Made on 10/06/2023
package learningJava;

// Import the scanner library
import java.util.Scanner;

public class ForLoop {
	// Basic authentication system in Java
	public static void main(String[] args) {
		// Default value if wrong account/password
		String authToken = "Wrong credentials. Please try again";
		
		// Array values
		String[] username = {"John", "Rita", "Jane", "Mark", "Nash"};
		String[] password = {"123", "1234", "12345", "123456", "1234567" };

		// User input
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String user = s.nextLine();
		
		System.out.print("Enter Password: ");
		String pass = s.nextLine();
		
		// Logic for finding match on user and password
		for(int i = 0; i < username.length; i++) {
			if(user.equalsIgnoreCase(username[i]) && pass.equalsIgnoreCase(password[i])) {
				authToken = "Welcome!";
				break;
			}else {
				continue;
			}
		}
		// authTokern Variable will change to "Welcome" if conditions are met / The values are right
		System.out.println(authToken);
	
		// End.
	}

}
