// Steven Loughran
// question 3
// May 1, 2019

class ThreeSportCar implements Test	{
	private String name;
	private long number;

	public ThreeSportCar(String name,long number)	{
		this.name = name;
		this.number = number;
	}

	public void print()	{
		System.out.println("Sports Car= Name: " + name +" and Number: "+number);
	}
}
