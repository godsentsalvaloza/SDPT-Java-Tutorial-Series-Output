package javaTutorial21AbstractionInterface;

public class Bird implements Animal, AirAnimal, LandAnimal {
	public void makeSound() {
		System.out.println("Chirp");
	}
	public void fly() {
		System.out.println("Flying");
	}
	public void walk() {
		System.out.println("Walking!");
	}
}
