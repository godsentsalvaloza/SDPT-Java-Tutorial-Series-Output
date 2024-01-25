// Made on 09/26/2023

package learningJava;

// Uses the Scanner module
import java.util.Scanner;

public class conditionalStatements {

	public static void main(String[] args) {
		// Average grade take and ranking checker
		
		// Input data
		Scanner s = new Scanner(System.in);
		
		System.out.print("What is your grade in English: ");
		double english = s.nextDouble();
		
		System.out.print("What is your grade in Filipino: ");
		double filipino = s.nextDouble();
		
		System.out.print("What is your grade in Computer: ");
		double computer = s.nextDouble();
		
		System.out.print("What is your grade in Science: ");
		double science = s.nextDouble();
		
		// Formula
		double finalScore = (english + filipino + computer + science) / 4;
		
		System.out.println("Your average score is " + finalScore);
		
		// Logic for grading reward system
		if(finalScore >100 ) {
			System.out.println("Invalid score");
		}else if(finalScore >=98) {
			System.out.println("Congratsulations, you have Highest Honors");
		}else if(finalScore >=95 ) {
			System.out.println("Congratsulations, you have High Honors");
		}else if(finalScore >=90) {
			System.out.println("Congratsulations, you have Honors");
		}else if(finalScore >=75) {
			System.out.println("Congratsulations, you passed");
		}else {
			System.out.println("You failed");
		}
		
		
		
	}

}
