import java.text.NumberFormat;

public class Register {

	// fields
	private static final double TAX = 0.08125;
	private double subtotal;
	private double total; 
	private NumberFormat numForm = NumberFormat.getCurrencyInstance();
	Order order = new Order();
	
	
	// constructors
	public Register(Order order) {
		this.order = order;
		order.incrementNo();
	}
	
	//assessors, mutators
	public double getSubtotal() {
		return subtotal;
	}
	
	public double getTax() {
		return TAX;
	}
	
	public double getTotal() {
		return total;
	}
	// calculations
	public double calcSubtotal() {
		for (int i = 0; i < order.getSize(); i++) {
			Item item = order.getItem(i);
			subtotal += item.getPrice();
		}
		return subtotal;
	}
	
	public double calcTax() {
		return subtotal * TAX; 
	}
	
	public double calcTotal() {
		total = subtotal + calcTax();
		return total;
	}
	
	public void clearPayments() {
		subtotal = 0;
		total = 0;
	}
	
	public String checkPayment(double payment) {
		if (payment == total) {
			return "Enough Money Tendered";
		} else if (payment > total) {
			return "Here is your change: " + numForm.format(payment - total);
		}
		else {
			return "Please pay: " + numForm.format(total - payment) + " more.";
		}
	}
	
	// toString, print receipt
	public String toString() {
		String str = "------------Waiter-----------\n"
				+ "Order No. " + order.getNumber() + "\n"
				+ "Server's Name: " + order.getServer() + "\n"
				+ "----------------------------------\n";
		str += order.toString();
		str += "-------------------------------------------\n"
				+ "Subtotal:\t\t\t" + numForm.format(calcSubtotal())
				+ "\nTax:\t\t\t" + numForm.format(calcTax())
				+ "\nTotal:\t\t\t" + numForm.format(calcTotal());
		return str;
		
	}
}



