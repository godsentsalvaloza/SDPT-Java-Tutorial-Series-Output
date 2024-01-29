package javaTutorial22ArrayOfObjects;
// Made on 01 / 29 / 2024
// Student Registration Simulation
import java.util.Scanner;

public class Main {
	// Variables
	static int entries, year, update = 0;
	static String firstName, lastName, section, course;
	static Scanner scan = new Scanner(System.in);
	
	// Collecting information
	static void gatherInfo() {
		System.out.print("Enter first name: ");
		firstName = scan.nextLine();
		
		System.out.print("Enter last name: ");
		lastName = scan.nextLine();
		
		System.out.print("Enter section : ");
		section = scan.nextLine();
		
		System.out.print("Enter course: ");
		course = scan.nextLine();
		
		System.out.print("Enter year (In numbers): ");
		year = scan.nextInt();
		scan.nextLine();
		System.out.println("");
	}
	public static void main(String[] args) {
		
		// Enties question
		System.out.print("How many entries do you want to enter: ");
		entries = scan.nextInt();
		scan.nextLine();
		
		Enroll[] enrollee = new Enroll[entries];
		
		// Loop for entries questions
		for(int x = 0; x < (entries); x++) {
			gatherInfo();
			enrollee[update] = new Enroll(firstName, lastName, section, course, year);
			update++;		
		}
		for(Enroll x: enrollee) {
			x.introduceSelf();
		}
	}
}
