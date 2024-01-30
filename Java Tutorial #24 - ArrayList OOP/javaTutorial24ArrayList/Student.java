package javaTutorial24ArrayList;

public class Student {
	String firstName, lastName;
	String course, section;
	int year;
	int cpNumber;
	
	Student(String firstName, String lastName, String course, String section, int year, int cpNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.year = year;
		this.cpNumber = cpNumber;
	}
	
	void introduceSelf() {
		System.out.println("");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Course: " + course);
		System.out.println("Section: " + section);
		System.out.println("Year: " + year);
		System.out.println("Contact Number: " + cpNumber);
		System.out.println("");
	}
	
}
