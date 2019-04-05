// Steven Loughran
// Lab 7 - My Long Test
// April 3, 2019

public class MyLongTest {

	public static void main(String[] args) {
		
		MyLong mylong1 = new MyLong(123456789L);
		
		if(mylong1.isEven())	{
			System.out.println("Number " + mylong1.getValue() +" is Even.");
		}
		if(mylong1.isOdd())		{
			System.out.println("Number " + mylong1.getValue() +" is Odd.");
		}
		if(mylong1.isPrime())	{
			System.out.println("Number " + mylong1.getValue() +" is Prime.");
		}

  
		long val = 987654322L;

		if(MyLong.isEven(val))	{
			System.out.println("Number " + val +" is Even.");
		}
		if(MyLong.isOdd(val))	{
			System.out.println("Number " + val +" is Odd.");
		}
		if(MyLong.isPrime(val))		{
			System.out.println("Number " + val +" is Prime.");
		}

		MyLong mylong2 = new MyLong(981276345L);
		
		if(MyLong.isEven(mylong2))	{
			System.out.println("Number " + mylong2.getValue() + " is Even.");
		}
		if(MyLong.isOdd(mylong2))	{
			System.out.println("Number " + mylong2.getValue() + " is Odd.");
		}
		if(MyLong.isPrime(mylong2))		{
			System.out.println("Number " + mylong2.getValue() + " is Prime.");
		}

		char ch[]={'1','2','3','4','5','6','7','8','9','1','2','3'};
		
		long long1 = MyLong.parseLong(ch);
			System.out.println("The array of numeric characters to a long value is: " + long1);

		String str="73826383738373";

		long long2 = MyLong.parseLong(str);
			System.out.println("The string to a long value is: " + long2);

}

}
