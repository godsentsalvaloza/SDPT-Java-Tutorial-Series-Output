// Made on 10/10/2023

package learningJava;

public class MethodsFunctions {

	public static void main(String[] args) {
		// Non-dynamic function for numbers - uses predetermined values
		
		// Uses a function to make a sum of all value in an array
		int numbers[] = {1,2,3,4,5};
		
	
		
		// This exercise are tasked to print the result in the main static
		System.out.println(summation(numbers));
		
		
	}
	// Summation function
	static int summation(int numbers[]) {
		int sum = 0;
		
		for(int number: numbers) {
			sum = sum + number;
		}
		return sum;
	}
}
