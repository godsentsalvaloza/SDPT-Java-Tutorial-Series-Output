// Made on 01 / 25 / 2024
package javaTutorial13ClassesAndObjects;
public class Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.firstName = "David";
		p.lastName = "Dela Cruz";
		p.age = 21;
		p.sex = 'M';
		
		Person p1 = new Person();
		p1.firstName = "ALenere";
		p1.lastName = "Dela Cruz";
		p1.age = 19;
		p1.sex = 'F';
		
		System.out.println(p.firstName);
		System.out.println(p1.firstName);
		
	}

}
