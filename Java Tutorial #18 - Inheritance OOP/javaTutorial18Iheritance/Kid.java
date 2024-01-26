package javaTutorial18Iheritance;
public class Kid extends Toddler {
	
	int gradeLevel;
	String school;
	
	Kid(String name, String sex, int age, String favoriteGame, String favoriteFood, int gradeLevel, String school) {
		super(name, sex, age, favoriteGame, favoriteFood);
		this.gradeLevel = gradeLevel;
		this.school = school;
	}
	Kid(String name, String sex, int age) {
		super(name, sex, age, "N/A", "N/A");
		this.gradeLevel = 0 ;
		this.school = "N/A";
	}
	
	void checkStatus() {
		super.checkStatus();
		System.out.println("Grade level : " + gradeLevel);
		System.out.println("School : " + school);
	}
}
