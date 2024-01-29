package javaTutorial21AbstractionInterface;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
		Frog f = new Frog();
		Bird b = new Bird();
		
		d.makeSound();
		f.makeSound();
		b.makeSound();
		
		b.walk();
		b.fly();
		d.walk();
		f.swim();
		f.walk()
;	}

}
