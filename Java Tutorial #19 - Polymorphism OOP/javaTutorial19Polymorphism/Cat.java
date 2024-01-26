package javaTutorial19Polymorphism;

public class Cat extends Animal{
	Cat() {
		name = "Cat";
		kindOfAnimal = "Land";
	}
	
	void makeSound() {
		System.out.println("Meow");
		introduce();
	}
}
