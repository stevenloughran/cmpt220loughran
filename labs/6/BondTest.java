// Steven Loughran
// Lab 6 Problem 2 Bonds Test
// 27 March 2019

public class BondTest {

   public static void main(String[] args) {
       Bond bond = new Bond(500, 100, 0.05, 10000);

       System.out.printf("The price of the bind is: $ %.2f", bond.getPrice());
   }
}
