package javaTutorial19Polymorphism;

public class Dog extends Animal {
	Dog() {
		name = "Dog";
		kindOfAnimal = "Land";
	}
	
	void makeSound() {
		System.out.println("Woof");
		introduce();
	}
}
