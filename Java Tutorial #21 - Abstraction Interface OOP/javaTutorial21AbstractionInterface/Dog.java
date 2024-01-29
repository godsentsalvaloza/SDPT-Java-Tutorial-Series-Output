package javaTutorial21AbstractionInterface;

public class Dog implements Animal, LandAnimal{
	public void makeSound() {
		System.out.println("Arf");
	}
	public void walk() {
		System.out.println("Walking");
	}
}
