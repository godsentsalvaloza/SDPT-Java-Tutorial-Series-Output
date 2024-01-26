package javaTutorial19Polymorphism;

public class Animal {

	String name, kindOfAnimal;
	
	void makeSound() {
		System.out.println("Override this function");
		
	}
	void introduce() {
		System.out.println("Name: " + name + " Kind of animal: " + kindOfAnimal);
	}
	
}
