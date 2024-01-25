package javaTurorial15ObjectMethods;

public class Subject {
	
	String firstName, lastName, course, section ;
	int year;
	double midtermGrade, finalGrade;
	
	Subject(String firstName, String lastName, String course, String section, int year, double midtermGrade, double finalGrade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.year = year;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
	}
	
	String introduce() {
		return "My name is " + firstName + " " + lastName + " My course is " + course + " From section " + section + " Year " + year ;
	}
	String grade() {
		double score = (midtermGrade + finalGrade) / 2;
		
		if(score >= 97) {
			return "Your grade is " + score + " You have highest honors!" ;
		}else if(score >= 95) {
			return "Your grade is " + score + " You have high honors!" ;
		}else if(score >= 90) {
			return "Your grade is " + score + " You have honors!" ;
		}else if(score >= 75) {
			return "Your grade is " + score + " You passed" ;
		}else{
			return "Your grade is " + score + " You failed" ;
		}
	}

}
