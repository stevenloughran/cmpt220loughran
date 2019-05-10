import java.util.Scanner;

public class Waiter {
	
	public static void main (String[] args) {

		Scanner reader = new Scanner(System.in);
		//print out a greeting
		System.out.println("Welcome to Waiter Menu");
		System.out.println("We serve the typical food you may like!");
		
		// get a menu
		Menu menu = new Menu();
		System.out.println(menu);
		
		// read full menu
		System.out.println("Would you like to read full menu or just a section [Full] [Section]");
		
		// get the answer
		String answer = reader.next();
		
		// check the answer
		while (!(answer.equalsIgnoreCase("full") || answer.equalsIgnoreCase("section"))) {
			System.out.println("Invalid input. Please enter again.");
			answer = reader.next(); // rescans input
		}
		if (answer.equalsIgnoreCase("full")) {
			System.out.println(menu); // prints full menu
		}
		else {
			// read a section of the menu
			System.out.print("Which section? [Appetizers] [Burgers] [Breakfast] [Entress] [Sides] [Drinks]");
			
		}
		
		// check for answer
		String section = reader.next().toLowerCase();
		while (!(section.equalsIgnoreCase("appetizers") || section.equals("burgers") || section.equals("breakfast") || section.equals("entress") || section.equals("sides") || section.equals("drinks"))) {
			System.out.println("Invalid input. Please try again.");
			section = reader.next().toLowerCase(); // rescans input
		}
		
		if (section.equals("appetizers")) {
			System.out.println(menu.getAllAppetizers());
		}
		else if (section.equals("burgers")) {
			System.out.println(menu.getAllBurgers());
		}
		else if (section.equals("breakfast")) {
			System.out.println(menu.getAllBreakfast());
		}
		else if (section.equals("entress")) {
			System.out.println(menu.getAllEntrees());
		}
		else if (section.equals("sides")) {
			System.out.println(menu.getAllSides());
		}
		else {
			System.out.println(menu.getAllDrinks());
		}
	
		// place an order
		System.out.println("To order, enter the ite ID to the right of the item's name: ");
		String itemID = reader.next().toUpperCase();
		char itemSection = itemID.charAt(0); // gets letter off front of itemID
		while (!(itemSection == 'A') || itemSection == 'B' || itemSection == 'b' || itemSection == 'E' || itemSection == 'S' || itemSection == 'D' || itemID.length() == 2 || itemID.length() == 3) {
			System.out.println("Invalid input. Please enter again: ");
			itemID = reader.next().toUpperCase();  //rescans input
			itemSection = itemID.charAt(0);
		}
	}
		Order order = new Order();
		
	}
	

