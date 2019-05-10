
import java.util.ArrayList;
import java.util.Random;

public class Order {
	// fields
	private static int orderNo = 0;
	private ArrayList<Item> order = new ArrayList<Item>();
	
	// constructors
	public Order() {
		
	}
	//assessors, mutators
	
	/* get item from the order*/
	public Item getItem(int index) {
		return order.get(index);
	}
	/*add item to order*/
	public void addItem(Item item) {
		order.add(item);
	}
	
	// methods
	
	/*remove an item from order */
	public void removeItem(Item item) {
		order.remove(item);
	}
	/* get order size or number of items in an order */
	public int getSize() {
		return order.size();
	}
	
	/*clears the order */
	public void clearOrder() {
		order.clear();
	}
	/* get order number*/
	public int getNumber() {
		return orderNo;
	}
	
	/*increment order number */ 
	public void incrementNo() {
		orderNo++;
	}
	
	/* gets a random server for the order*/
	public String getServer() {
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		switch(num) {
			case 1:
				return "Aileen";
			case 2:
				return "Angel";
			case 3:
				return "Ryan";
			case 4:
				return "Will";
			case 5:
				return "Ariana";
			case 6: 
				return "Mike";
			default:
				return "no server";
		}// end of switch
	}

	
	// toString
	public String toString() {
		String str = "";
		for (int i = 0; i < order.size(); i++) {
			str += order.get(i).toString() + "\n\n";
		}
		return str; 
	}
}