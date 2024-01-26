package javaTutorial19Polymorphism;

public class Tiger extends Animal {
	Tiger() {
		name = "Tiger";
		kindOfAnimal = "Land";
	}
	
	void makeSound() {
		System.out.println("Rawr");
		introduce();
	}
}
