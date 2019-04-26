// Steven Loughran
// binary to Decimal 3
// April 24, 2019

import java.io.*;

public class bin2Dec3 {

	public static void main(String[] args) throws IOException
	{
	
	try {
		BufferedReader bf = new BufferedReader
				(new InputStreamReader(System.in));
	System.out.print("Enter a Binary value: ");
		String str = bf.readLine();
		int i = binaryToDecimal(str);
		System.out.println("Decimal = " + i);
	}
	
	
	catch(NumberFormatException ex) {
		System.out.println("Number Format Exception occured.");
		System.out.println(ex.getMessage());
		System.exit(0);
	}

	}
	
	public static int binaryToDecimal(String binaryString) {
		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			Character binaryChar = binaryString.charAt(i);
			String tempStr = binaryChar.toString();
			
			int tempInt = Integer.parseInt(tempStr);
			
			if (tempInt != 0 && tempInt != 1) {
				System.out.println("Invalid binary number entered");
				System.exit(0);
			}
			decimalValue = decimalValue * 2 + tempInt;
		}
		return decimalValue;
		
	}
}
