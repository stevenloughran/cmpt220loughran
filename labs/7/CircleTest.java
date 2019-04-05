// Steven Loughran
// Lab 7 - Circle Test
// April 3, 2019

class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle(2, 2, 5.5);
		      
		System.out.println("Area of circle is " + circle.getArea());
		System.out.println("Perimeter of circle is " + circle.getPerimeter());
		      
		Circle otherCircle1 = new Circle(3, 3, 0);
			System.out.println("X and Y are in the circle: " + circle.contains(otherCircle1.getX(), otherCircle1.getY()));
		      
		Circle otherCircle2 = new Circle(4, 5, 10.5);
		 	System.out.println("One circle in the other: " + circle.contains(otherCircle2));
		      
		Circle otherCircle3 = new Circle(3, 5, 2.3);
		 	System.out.println("One circle overlaping the other: " + circle.overlaps(otherCircle3));
		}

	}
