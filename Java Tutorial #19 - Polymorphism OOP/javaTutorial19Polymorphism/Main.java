package javaTutorial19Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Animal b = new Bird();
		Animal c = new Cat();
		Animal d = new Dog();
		Animal t = new Tiger();
		
		
		b.makeSound();
		c.makeSound();
		d.makeSound();
		t.makeSound();
		
	}

}
