// Made on 01 / 30 / 2023
package javaTutorial24ArrayList;
// Import neccessary utilities
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	//Initialize Variable
	static ArrayList <Student> students = new ArrayList <Student>();
	static Scanner scan = new Scanner(System.in);
	static String firstName, lastName;
	static String course, section;
	static int year;
	static int cpNumber;
	static int saveStatus;
	static int studentIndex = 0;
	static int entryState;
	static boolean anotherEntry;
	
	
	// Static Main Function
	public static void main(String[] args) {
		main();
	}
	//Main sub-function
	static void main() {
		collectInformation();	
	// Information Gathering
	}
	static void collectInformation() {
		System.out.print("Enter first name: ");
		firstName = scan.nextLine();
		
		System.out.print("Enter last name: ");
		lastName = scan.nextLine();
		
		System.out.print("Enter course: ");
		course = scan.nextLine();
		
		System.out.print("Enter section: ");
		section = scan.nextLine();
		
		System.out.print("Enter School year(in numbers): ");
		year = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter contact number: ");
		cpNumber = scan.nextInt();
		scan.nextLine();
		
		saveInformation();
	// Prompt user to ask if the data are confirmed
	}
	static void saveInformation() {
		System.out.print("Do you want to save changes(1 for yes / 0 for no): ");
		saveStatus = scan.nextInt();
		scan.nextLine();
		
		if(saveStatus == 1) {
			saveFile();
			
		}else if(saveStatus == 0) {
			collectInformation();
		}
	}
	//Saving file and printing the information - Asking user for another entry
	static void saveFile() {
		students.add(new Student(firstName, lastName, course, section, year, cpNumber));
		System.out.println(" ");
		System.out.println("Saved successfully!");
		students.get(studentIndex).introduceSelf();
		System.out.println(" ");
		System.out.print("Would you like to enter anoter entry(1 for yes / 0 for no): ");
		entryState = scan.nextInt();
		scan.nextLine();
		if(entryState == 1) {
			studentIndex++;
			main();
		}else if(entryState == 0) {
			printIndex();
		}
	}
	//Printing all entries in the ArrayList
	static void printIndex() {
		System.out.println(" ");
		System.out.println("Here are the entries:");
		System.out.println(" ");
		for(Student stu: students) {
			stu.introduceSelf();
		}
	}
}
// End