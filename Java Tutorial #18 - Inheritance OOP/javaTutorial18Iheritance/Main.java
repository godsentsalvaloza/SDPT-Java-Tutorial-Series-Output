// Made on 01 / 26 / 2024
package javaTutorial18Iheritance;
public class Main {

	public static void main(String[] args) {
		// Person object
		Person per1 = new Person("Jane", "Female", 21);
		
		// Toddler object
		Toddler tod1 = new Toddler("Ben", "Male", 2, "Nintendo", "Soup");
		
		//Kid object
		Kid kid1 = new Kid("Martin", "Male", 7, "Minecraft", "Spaghetti", 4, "Harvard");
		Kid kid2 = new Kid("John", "Male", 7);
		
		per1.checkStatus();
		System.out.println(" ");
		tod1.checkStatus();
		System.out.println(" ");
		kid1.checkStatus();
		System.out.println(" ");
		kid2.checkStatus();
	}

}
