// Made on 09/25/2023

package learningJava;

// Utilizes the scanner module
import java.util.Scanner;
public class arrayWIthScanner {

	public static void main(String[] args) {
		// This only uses an array as a variable and prints it immediately
		
		System.out.print("Enter your name: ");
		Scanner s = new Scanner(System.in);
		
		String name[] = new String[10];
		
		name[0] = s.nextLine();
		
		System.out.println(name[0]);
		
		
	}

}
