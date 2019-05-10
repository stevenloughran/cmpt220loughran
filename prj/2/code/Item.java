
import java.text.NumberFormat;

public class Item {
	// fields
	private double price;
	private String name;
	private String category;
	private String size;
	NumberFormat numForm = NumberFormat.getCurrencyInstance();
	
	// constructors 
	public Item(String name, String category, double price) {
		this.price = price;
		this.category = category;
		this.name = name;
	}
	
	public Item(String name, String category, double price, String size) {
		this.price = price;
		this.category = category;
		this.name = name;
		this.size = size;
	}
	
	// assessors and mutators
	public double getPrice() { 
		return price;
	}
// public void setPrice(double p) { price = p; }
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	//toString
	public String toString() {
		if(size != null) {
			return "(" + size + ")" + name + "\t" + numForm.format(price); }
		else { 
			return name + "\t" + numForm.format(price);
			}
		}
	}

