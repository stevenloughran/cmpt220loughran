// Steven Loughran   
// Lab 4 Problem 5
// 20 February 2019

// Write a Java program that generates 1000 random integers, calculates the average and
//prints two counts, one for the numbers lower than the average and one for the numbers
//larger than the average.

import java.util.Random;

public class problem5 {

   public static void main(String[] args) {
      double avg = 0 ;
      int[] a = new int[1000];
      Random rand = new Random();

    for(int i = 0; i < 1000; i++) {
    	a[i] = rand.nextInt(10000);
    	avg = avg + a[i]; }
       
    	avg = avg / 1000;
        int count1 = 0;
        int count2 = 0;
        
    for(int i = 0; i < 1000; i++) {
    	if ( a[i] < avg )
    		count1++;
    	if ( a[i] > avg )
    		count2++;	
    	}
    
    System.out.println("Integers less than average are " + count1);
    System.out.println("Integers greater than average are " + count2);
   }
}