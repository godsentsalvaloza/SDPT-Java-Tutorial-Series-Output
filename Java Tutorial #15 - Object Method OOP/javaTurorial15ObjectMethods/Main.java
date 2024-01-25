// Made on 01 / 25 / 2024
package javaTurorial15ObjectMethods;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = s.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = s.nextLine();
		
		System.out.print("Enter your course: ");
		String course = s.nextLine();
		
		System.out.print("Enter your section: ");
		String section = s.nextLine();
		
		System.out.print("Enter your academic year: ");
		int year = s.nextInt();
		
		System.out.print("Enter your midterm grade: ");
		double midGrade = s.nextDouble();
		
		System.out.print("Enter your final grade: ");
		double finalGrade = s.nextDouble();
		
		
		Subject s1 = new Subject(firstName, lastName, course, section, year, midGrade, finalGrade);
		System.out.println(s1.introduce());
		System.out.println(s1.grade());
	}

}
