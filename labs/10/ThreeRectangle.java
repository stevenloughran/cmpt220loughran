// Steven Loughran
// question 3
// May 1, 2019

class ThreeRectangle implements Test	{
	private int length;
	private int width;

	public ThreeRectangle(int length,int width)	{
		this.length = length;
		this.width = width;
	}
	public void print()	{
		System.out.println("Rectangle= Length: "+length+" and Width: "+ width +" Area : "+ length * width);
	}
}
