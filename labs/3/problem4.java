// Steven Loughran 
// Lab 3 problem 4
// 2 February 2019

// Write a program that finds the largest n such that n is a prime number and n < 15,000.

// how to know if prime number: number divided by one or itself
// see to divide by another number. (2, 3, 4, 5, etc)

// JA: NOt sure I understand this
public class problem4 {

	public static void main(String[] args) {
        int num = 100;
        int maxPrime = 0;
        boolean prime ; 
        int n = 0;

        for (int i = 3 ; i < num ; i = i+2 ) {
        	prime = true;
        	for (n=i ; n > 1 ; n = n-1) {
            if (i % n == 0) {
            	System.out.println("The current value of n is " + n );
            	prime = false;
            }
        	}
           
        	if (prime == true);
            	maxPrime = i;
            	System.out.println("The answer is " + maxPrime );
            }
          }
        
       // 	 System.out.println("The answer is " + maxPrime );
        }



	