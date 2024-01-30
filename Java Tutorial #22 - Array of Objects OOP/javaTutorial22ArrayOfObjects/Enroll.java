package javaTutorial22ArrayOfObjects;

public class Enroll {

	private String firstName, lastName, section, course;
	private int year;
	
	Enroll(String firstName, String lastName, String section, String course, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.course = course;
		this.year = year;
	}
	public void introduceSelf() {
		System.out.println(" ");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Section: " + section);
		System.out.println("Course: " + course);
		System.out.println("Year: " + year );
		System.out.println(" ");
		
		
	}
}
