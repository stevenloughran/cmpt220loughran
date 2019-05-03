// Steven Loughran
// Question 2
// May 1, 2019

public abstract class TwoEmployee {
	String name;
	double age;
	double hourRate;
 
	public TwoEmployee(String name, double age, double hourRate) {

	       super();

	       this.name = name;

	       this.age = age;

	       this.hourRate = hourRate;

	   }

	   public abstract double salary(double hours);

	   @Override

	   public String toString() {

	       return "Name = " + name + ", Age = " + age + ", Hour Rate = " + hourRate;

	   }

	  

	  

	  

	}
