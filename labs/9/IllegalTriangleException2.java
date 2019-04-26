// Steven Loughran
// IllegalTriangleException
// April 24, 2019

public class IllegalTriangleException2 extends Exception{
	public  IllegalTriangleException2() {
		System.out.println("The sum of the two sides is greater than " + "the other side");
	}
}
