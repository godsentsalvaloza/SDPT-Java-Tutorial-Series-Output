package javaTutorial20Abstraction;
// Made on 01 / 26/ 2024
public class Main {

	public static void main(String[] args) {
		// Abstract Idea
			//Animal s = new Animal();
		
		// Concrete Idea
		Animal a = new Dog();
		Animal b = new Cat();
		
		a.makeSound();
		b.makeSound();
		
		a.setName("Doggy");
		b.setName("Catty");
		
		a.showName();
		b.showName();
	}

}
