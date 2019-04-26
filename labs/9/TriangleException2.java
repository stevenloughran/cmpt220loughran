// Steven Loughran
// Triangle Exception
// April 24, 2019

public class TriangleException2 {
		private double side1;
		private double side2;
		private double side3;
		
		public TriangleException2() {
		}
		
		public TriangleException2(double s1, double s2, double s3) 
		throws IllegalTriangleException2
		{
			side1 = s1;
			side2 = s2;
			side3 = s3;
		
		try {
			if ((side1 + side2) < side3 || (side2 + side3) < side1 ||
				(side1 + side3) < side2)
				throw new IllegalTriangleException2();
		}
		catch (IllegalTriangleException2 ex) {
			System.out.println(ex);
		}
	}
		
		double getside1() {
			return side1;
		}
		double getside2() {
			return side2;
		} 
		double getside3() {
			return side3;
		}
		double getarea() {
			double s = (side1 + side2 + side3) / 2;
			double area = s * (s - side1) * (s - side2) * (s - side3);
				return area;
		}
		
		double getperimeter() {
			return (side1 + side2 + side3);
		}
		
		public String toString() {
			return "Traingle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
			
		
	}

}
