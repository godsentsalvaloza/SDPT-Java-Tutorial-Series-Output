// Made on 10/02/2023

package learningJava;

// Imports the scanner library
import java.util.Scanner;
public class switchStatements {

	public static void main(String[] args) {
	// Transforms the numerical month into sting-based month
		
		
		//Input
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Day: ");
		int day = s.nextInt();
		
		System.out.print("Enter Month: ");
		int month = s.nextInt();
		
		System.out.print("Enter Year: ");
		int year = s.nextInt();
		
		String monthWord = "";
		
		// Converts the month from intiger to string
		switch(month) {
			case 1: {
				monthWord = "January";
				break;
			}
			case 2: {
				monthWord = "Feburary";
				break;
			}
			case 3: {
				monthWord = "March";
				break;
			}
			case 4: {
				monthWord = "April";
				break;
			}
			case 5: {
				monthWord = "May";
				break;
			}
			case 6: {
				monthWord = "June";
				break;
			}
			case 7: {
				monthWord = "July";
				break;
			}
			case 8: {
				monthWord = "August";
				break;
			}
			case 9: {
				monthWord = "September";
				break;
			}
			case 10: {
				monthWord = "October";
				break;
			}
			case 11: {
				monthWord = "November";
				break;
			}
			case 12: {
				monthWord = "December";
				break;
			}
			default: {
			
				break;
			}
		}
		
		
		// Logic used to determine if the input is acceptable
		if(monthWord == "") {
			System.out.println("Invalid Date");
		}else {
			if(day >=32 || day <=0 || year > 2023 ) {
				System.out.print("Invalid Date");
			}else {
				System.out.print(monthWord + " " + day + ", " + year );
			}
		}
		// End.
	}

}
