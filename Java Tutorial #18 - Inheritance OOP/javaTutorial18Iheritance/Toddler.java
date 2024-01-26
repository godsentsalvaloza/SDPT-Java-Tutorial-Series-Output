package javaTutorial18Iheritance;

public class Toddler extends Person {
	
	String favoriteGame;
	String favoriteFood;
	
	Toddler(String name, String sex, int age, String favoriteGame, String favoriteFood) {
		super(name, sex, age);
		this.favoriteGame = favoriteGame;	
		this.favoriteFood = favoriteFood;
	}
	void checkStatus() {
		super.checkStatus();
		System.out.println("Favorite Game : " + favoriteGame);
		System.out.println("Favorite Food : " + favoriteFood);
	}
	
	void drink() {
		System.out.println("Dinking Milk");
	}
}
