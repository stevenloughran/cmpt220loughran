// Steven Loughran
// Question 2
// May 1, 2019

public class TwoClerk extends TwoEmployee{

   public TwoClerk(String name, double age, double hourRate) {
       super(name, age, hourRate);

   }

   @Override

   public double salary(double hours) {
       return hourRate*hours;

   }

}