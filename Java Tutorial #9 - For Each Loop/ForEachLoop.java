// Made on 10/08/2023

package learningJava;

public class ForEachLoop {
	
	public static void main(String[] args) {
		// Variables
		int numbers[] = {100, 122, 302, 560, 1080, 720};
		
		// For-each loop for adding all numbers in an array
		
		int sum = 0;
		
		for(int num: numbers) {
			sum = sum + num;
		}
		System.out.println("The sum is: " + sum);
		// End.
	}

}
