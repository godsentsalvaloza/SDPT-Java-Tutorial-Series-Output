package javaTutorial19Polymorphism;

public class Bird extends Animal {
	Bird() {
		name = "Bird";
		kindOfAnimal = "Air";
	}
	
	void makeSound() {
		System.out.println("Tweet");
		introduce();
	}
}
