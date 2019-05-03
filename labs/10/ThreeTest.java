// Steven Loughran
// question 3
// May 1, 2019

interface Test {
 public void print();
}

public class ThreeTest {
	public static void main(String args[]) {
		Test vec[] = {
			new ThreeRectangle(200,100),
			new ThreeSportCar("Lambo", 100000),
			new ThreeRectangle(32,30),
			new ThreeManager("Aileen", 37),
			new ThreeRectangle(50,15),
			new ThreeSportCar("Lexus", 97000),
			new ThreeSportCar("Acura", 125000),
			new ThreeManager("Andrew", 38)
		};
		
		for (int index=0; index<vec.length; index++) {
			vec[index].print();
		}
	}
}

