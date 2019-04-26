//Steven Loughran
// java Problem_3 hello test.txt
// April 24, 2019

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class helloTest4 {

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java Problem_3 hello test.txt");
			System.exit(0);
		}
		
		File SourceFile = new File(args[1]);
		File temSource = new File("temp.txt");
		if(!SourceFile.exists()) {
			System.out.println("Sourc file " + args[1] + " does not exist.");
			System.exit(0);
		}
		
		Scanner input = new Scanner(SourceFile);
		PrintWriter output = new PrintWriter(temSource);
		
		while(input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[0], "");
			output.println(s2);
		}
		
		input.close();
		output.close();
		
		File newSource = new File("temp.txt");
		File overriteFile = new File(args[1]);
		
		Scanner newinput = new Scanner(newSource);
		PrintWriter newoutput = new PrintWriter(overriteFile);
	
		while(newinput.hasNext()) {
			String s1 = newinput.nextLine();
			newoutput.println(s1);
		}
		newinput.close();
		newoutput.close();
		
		if(overriteFile.exists())
			overriteFile.delete();
	}
	
}
