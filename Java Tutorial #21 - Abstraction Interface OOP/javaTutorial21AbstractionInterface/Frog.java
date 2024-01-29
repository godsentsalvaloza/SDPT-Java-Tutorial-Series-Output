package javaTutorial21AbstractionInterface;

public class Frog implements Animal, LandAnimal, WaterAnimal{
	public void makeSound() {
		System.out.println("Ribbit!");
	}
	public void walk() {
		System.out.println("Walking");
	}
	public void swim() {
		System.out.println("Swimming!");
	}
}
