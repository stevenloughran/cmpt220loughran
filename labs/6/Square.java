// Steven Loughran
// Lab 6 Square
// 20 March 2019

public class Square {

   double width = 1;

   Square() {}
   
   Square(double width) {
       this.width = width;
   }

   double getPerimeter() {
       return 4 * width;
   }

   double getArea() {
       return width * width;
   }
}
