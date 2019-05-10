import java.util.ArrayList;

public class Menu {
	// fields
	private ArrayList<Item> appetizers = new ArrayList<Item>() ;
	private ArrayList<Item> burgers = new ArrayList<Item>() ;
	private ArrayList<Item> breakfast = new ArrayList<Item>() ;
	private ArrayList<Item> entrees = new ArrayList<Item>() ;
	private ArrayList<Item> sides = new ArrayList<Item>() ;
	private ArrayList<Item> drinks = new ArrayList<Item>() ;
	
	// constructors
	
	public Menu() {
		populateMenu();
	}
	
	// assessors and mutators
	
///////////////////////////////////////////////////////
	// returns a specific appetizer
	public Item getAppetizer(int index) {
		return appetizers.get(index);
	}
	
	// returns the size of the category appetizers
	public int getAppetizersSize() {
		return appetizers.size();
	}
	
	// returns all appetizers as a String
	public String getAllAppetizers() {
		String aMenu = "";
		System.out.print("\n");
		aMenu += "APPETIZERS:\n";
		for (int i = 0; i < appetizers.size(); i++) {
			Item a = appetizers.get(i);
			// add id, name, and price
			aMenu += "A" + (i+1) + " " + a.toString() + "\n";
		}
		return aMenu;
	}
//////////////////////////////////////////////////
	
	// returns a specific burgers
	public Item getBurgers(int index) {
		return burgers.get(index);
	}
	
	// returns the size of the category burgers
	public int getBurgersSize() {
		return burgers.size();
	}
	
	// returns all burgers as a String
	public String getAllBurgers() {
		String aMenu = "";
		aMenu += "BURGERS:\n";
		for (int i = 0; i < burgers.size(); i++) {
			Item b = burgers.get(i);
			// add id, name, and price
			aMenu += "B" + (i+1) + " " + b.toString() + "\n";
		}
		return aMenu;
	}
	
//////////////////////////////////////////////////
	
	// returns a specific breakfast
	public Item getBreakfast(int index) {
		return breakfast.get(index);
	}
	
	// returns the size of the category breakfast
	public int getBreakfastSize() {
		return breakfast.size();
	}
	
	// returns all breakfast as a String
	public String getAllBreakfast() {
		String aMenu = "";
		aMenu += "BREAKFAST:\n";
		for (int i = 0; i < breakfast.size(); i++) {
			Item be = breakfast.get(i);
			// add id, name, and price
			aMenu += "b" + (i+1) + " " + be.toString() + "\n";
		}
		return aMenu;
	}
	
///////////////////////////////////////////////
	
	// returns a specific entrees
	public Item getEntrees(int index) {
		return entrees.get(index);
	}
	
	// returns the size of the category entrees
	public int getEntreesSize() {
		return entrees.size();
	}
	
	// returns all entrees as a String
	public String getAllEntrees() {
		String aMenu = "";
		aMenu += "ENTREES:\n";
		for (int i = 0; i < entrees.size(); i++) {
			Item e = entrees.get(i);
			// add id, name, and price
			aMenu += "E" + (i+1) + " " + e.toString() + "\n";
		}
		return aMenu;
	}
///////////////////////////////////////////////////
	
	// returns a specific sides
		public Item getSides(int index) {
			return sides.get(index);
		}
		
		// returns the size of the category sides
		public int getSidesSize() {
			return sides.size();
		}
		
		// returns all sides as a String
		public String getAllSides() {
			String aMenu = "";
			aMenu += "SIDES:\n";
			for (int i = 0; i < sides.size(); i++) {
				Item s = sides.get(i);
				// add id, name, and price
				aMenu += "S" + (i+1) + " " + s.toString() + "\n";
			}
			return aMenu;
		}
		
/////////////////////////////////////////////////////////
		
		// returns a specific drinks
				public Item getDrinks(int index) {
					return drinks.get(index);
				}
				
				// returns the size of the category drinks
				public int getDrinksSize() {
					return drinks.size();
				}
				
				// returns all drinks as a String
				public String getAllDrinks() {
					String aMenu = "";
					aMenu += "DRINKS:\n";
					for (int i = 0; i < drinks.size(); i++) {
						Item d = drinks.get(i);
						// add id, name, and price
						aMenu += "D" + (i+1) + " " + d.toString() + "\n";
					}
					return aMenu;
				}
/////////////////////////////////////////////////////////////
	
	// methods
	public void populateMenu() {
		// appetizers
		appetizers.add(new Item("Spinach & Artichoke Dip", "Appetizers", 10.75));
		appetizers.add(new Item("Fried Calamari\t", "Appetizers", 11.95));
		appetizers.add(new Item("Mozzarella Sticks\t", "Appetizers", 9.95));
		appetizers.add(new Item("Buffalo Bites\t", "Appetizers", 9.95));
		appetizers.add(new Item("Buffalo Chicken Tenders", "Appetizers", 10.50));
		appetizers.add(new Item("Crab Cakes\t\t", "Appetizers", 12.95));
		appetizers.add(new Item("Nachos\t\t", "Appetizers", 8.95));
		appetizers.add(new Item("Cheese Quesadillas\t", "Appetizers", 8.50));
		appetizers.add(new Item("Onion Ring Tower\t", "Appetizers", 6.95));
		appetizers.add(new Item("Mac ‘n Cheese Balls\t", "Appetizers", 10.95));
		
		// sandwichesANDburgers
		burgers.add(new Item("Classic Hamburger\t", "Burgers", 6.25));
		burgers.add(new Item("Cheese Hamburger\t", "Burger", 7.25));
		burgers.add(new Item("Veggie Burger\t", "Burgers", 6.95));
		burgers.add(new Item("Turkey Hamburger\t", "Burgers", 6.25));
		burgers.add(new Item("Double Decker Burger\t", "Burger", 10.95));
		burgers.add(new Item("BBQ Burger\t\t", "Burger", 5.75));
				
		// breakfast
		breakfast.add(new Item("Scrambled Eggs\t", "Breakfast", 5.50));
		breakfast.add(new Item("Egg Whites\t\t", "Breakfast", 7.95));
		breakfast.add(new Item("Classic Cheese Omelet", "Breakfast", 7.95));
		breakfast.add(new Item("Buttermilk Pancakes\t", "Breakfast", 6.50));
		breakfast.add(new Item("Blueberry Pancakes\t", "Breakfast", 8.50));
		breakfast.add(new Item("Chocolate Chip Pancakes", "Breakfast", 8.50));
		breakfast.add(new Item("French Toast\t", "Breakfast", 6.75));
		breakfast.add(new Item("Belgian Waffle\t", "Breakfast", 6.95));
		breakfast.add(new Item("Fruit Salad\t\t", "Breakfast", 4.95));
		breakfast.add(new Item("Bagel with Cream Cheese", "Breakfast", 5.75));
		
		// entrees
		entrees.add(new Item("NY Sirloin Steak\t", "Entrees", 22.95));
		entrees.add(new Item("BBQ Baby Back Ribs\t", "Entrees", 22.95));
		entrees.add(new Item("Chicken Marsala\t", "Entrees", 16.95));
		entrees.add(new Item("Grilled Pork Chops\t", "Entrees", 19.95));
		entrees.add(new Item("Sea Scallops\t\t", "Entrees", 24.95));
		entrees.add(new Item("Shrimp Scampi\t", "Entrees", 20.95));
		entrees.add(new Item("Penne à la Vodka\t", "Entrees", 13.95));
		entrees.add(new Item("Seafood Alfredo\t", "Entrees", 20.95));
		entrees.add(new Item("Bang Bang Chicken & Shrimp", "Entrees", 20.95));
		entrees.add(new Item("Fish & Chips\t", "Entrees", 17.95));
		
		// sides
		sides.add(new Item("French Fries\t\t", "Sides", 5.95));
		sides.add(new Item("Sweet Potato Fries\t", "Sides", 6.95));
		sides.add(new Item("Mac & Cheese\t\t", "Sides", 5.85));
		sides.add(new Item("Broccoli\t\t", "Sides", 5.95));
		sides.add(new Item("Mashed Potatos\t", "Sides", 5.95));
		sides.add(new Item("Caesar Salad\t\t", "Sides", 5.95));
		sides.add(new Item("Baked Potatos\t", "Sides", 5.95));
		
		// drinks
		drinks.add(new Item("Diet Pepsi\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Pepsi\t\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Diet Coke\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Coke\t\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Coke Zero\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Sprite\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Dr. Pepper\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Minute Maid Limeade", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Iced Tea\t", "Drinks", 2.90, "12 oz"));
		drinks.add(new Item("Water\t", "Drinks", 1.10, "12 oz"));
	}
	
	// toString
	// prints out the full menu in one String
	public String toString() {
		String menu = "";
		menu += "WAITER MENU\n" +
	"---------------------------------------\n";
		
		menu += getAllAppetizers() + "\n";
		menu += getAllBurgers() + "\n";
		menu += getAllBreakfast() + "\n";
		menu += getAllEntrees() + "\n";
		menu += getAllSides() + "\n";
		menu += getAllDrinks() + "\n";
		
		return menu;
	}
}
