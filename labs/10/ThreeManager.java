// Steven Loughran
// question 3
// May 1, 2019

class ThreeManager implements Test	{
	private String name;
	private long deptNumber;

	public ThreeManager(String name, long deptNumber)	{
		this.name = name;
		this.deptNumber = deptNumber;
	}
	public void print()	{
		System.out.println("Manager= Name: " + name +" and Department Number: " + deptNumber);
	}
}