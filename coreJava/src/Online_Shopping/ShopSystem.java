package Online_Shopping;

import java.util.*;

public class ShopSystem {
	
	  private static Scanner sc = new Scanner(System.in);
	  private static List<Cart> cart = new ArrayList<>();
	  private static List<Product> product = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("--- Welecome to Rajmandir ---");
		System.out.println("1. Show Product:");
		System.out.println("2. Add to Cart");
		System.out.println("3. Remove from Cart");
		System.out.println("4. Display Product");
		System.out.println("5. Exit");
		System.out.println("Enter your Choice");
		
		int choice;
		choice=sc.nextInt();
		switch(choice) {
		case 1 -> showproduct();
		case 2 -> addtocart();
		case 3 -> removefromcart();
		case 4 -> displayproduct();
		case 5 -> System.out.println("Exit...Thank You");
		default -> System.out.println("Inavlid Choice...");
		
		
		}
		}

	private static void displayproduct() {
	}

	private static void removefromcart() {
	}

	private static void addtocart() {
	
	}

	private static void showproduct() {
		for(Product p: product) {
			p.getDetails();
		}
	}
		
		
}
