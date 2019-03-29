// Steven Loughran
// Lab 6 Square Test
// 20 March 2019

public class SquareTest {

	public static void main(String[] args) {
		Square square1 = new Square(40);
	    Square square2 = new Square(35.9);

	    System.out.println("Width of first square: " + square1.width);
	    System.out.println("Area of first square: " + square1.getArea());
	    System.out.println("Perimeter of first square: " + square1.getPerimeter());

	    System.out.println();
	      
        System.out.println("Width of second square: " + square2.width);
        System.out.println("Area of second square: " + square2.getArea());
	    System.out.println("Perimeter of second square: " + square2.getPerimeter());
	}

}
