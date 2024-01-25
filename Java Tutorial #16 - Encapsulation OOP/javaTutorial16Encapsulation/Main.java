// Made on 01 / 25 / 2024
package javaTutorial16Encapsulation;
public class Main {

	public static void main(String[] args) {
		// Demonstration of encapsulation for class objects
		User u = new User(262, "john123", "John", "Dela Cruz");
		
		u.setFirstName("Martin");
		
		
		System.out.println(u.getFirstName());
		System.out.println(u.getUserID());

	}

}


