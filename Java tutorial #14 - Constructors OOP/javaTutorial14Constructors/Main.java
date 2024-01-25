// Made on 01 / 25 / 2024
package javaTutorial14Constructors;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Product Name: ");
		String productName = s.nextLine();
		
		System.out.print("Product Price: ");
		double productPrice = s.nextDouble();
		
		System.out.print("Product quantity: ");
		int productQuantity = s.nextInt();
		
		
		Product p = new Product(productName, productPrice, productQuantity);
		System.out.println("The product name is: " + p.name + ".");
		System.out.println("THe product price is: " + p.price + ".");
		System.out.println("The product quantity is: " + p.quantity + ".");
		
		

	}

}
