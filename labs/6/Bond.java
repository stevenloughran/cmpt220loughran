// Steven Loughran
// Lab 6 Problem 2 Bonds
// 27 March 2019

public class Bond {
  
   double coupon;
   int payments;
   double interest;
   double valueMaturity;
  
   Bond() {}
	   Bond(double coupon, int payments, double interest, double valueMaturity) {
		   this.coupon = coupon;
	       this.payments = payments;
	       this.interest = interest;
	       this.valueMaturity = valueMaturity;
	   }
	       
   double getPrice() {
       double price;
       price = ( coupon * ( 1 - ( 1 / Math.pow( 1 + interest, payments) ) ) ) 
    		   + ( valueMaturity * ( 1 / Math.pow( 1 + interest, payments) ) );
       return price;
   }  
}