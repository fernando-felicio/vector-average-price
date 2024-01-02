package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many products will be added ?");
		int n = scanner.nextInt();
		Product[] vect = new Product[n];
		
				
		for (int i = 0; i < vect.length; i++) {
			scanner.nextLine();
			System.out.println("What is the name and value of product number " + (i + 1) + "?");
			System.out.println("Name: "); 
			String name = scanner.nextLine();
			System.out.println("Price: ");
			double price = scanner.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum	+= vect[i].getPrice();
		}
		
		double average = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", 
				average);		
		
		
		scanner.close();
		
	}

}
