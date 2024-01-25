// 10/08/2023

package learningJava;

public class NestedForLoopIneratingArrays {

	public static void main(String[] args) {
		
		// 2d Array
		String[][] users = {
				{"David", "david123"},	
				{"Alenere", "alenere123"},	
				{"Hazel", "hazel123"},	
				{"Jeymar", "jeymar123"},	
		};
		
		
		// Using for loop to optput the values of the 2d array
		/*
		for(int row = 0; row < users.length; row++ ) {
			
			
			for(int col = 0; col < users[row].length; col++) {
				System.out.println(users[row][col]);
			}
			System.out.println("");
		}
		*/
		// For-each  loop to out put the values of the 2d array
		for(String user[] : users) {
			
			for(String info: user) {
				System.out.println(info);
			}
			System.out.println(""); 
		}
		// End.
	}

}
