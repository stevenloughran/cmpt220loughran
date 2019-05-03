// Steven Loughran
// Question 2
// May 1, 2019

public class TwoTest {
 
	public static void main(String args[]) {
		TwoEmployee vec[] = {
			new TwoManager("John", 52, 104),
			new TwoClerk("Daniel", 26, 110),
			new TwoManager("Steve", 42, 120),
			new TwoManager("Stacey", 34, 120)};
		
		double hours[] = {140,150,130,180};
		double total = 0;
		for (int index = 0; index < vec.length; index++){
			total += vec[index].salary(hours[index]);
				System.out.println(vec[index]);
		}
		System.out.println("The total payment of the employees is "
				+ total);
		}
	}

