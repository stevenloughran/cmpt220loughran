// Steven Loughran  
// Lab 5 Problem 7
// 6 March 2019

//Write a method that will check if a matrix is an upper
//Write a test program to test your method.

public class problem7 {

	public static void main(String[] args) {
		System.out.println(isUpperTriangular(new double[][] {{2, 1, 4}, {0, 3, -1}, {0, 0, -2}}));
	}     
        public static boolean isUpperTriangular(double[][] array) {
		        
        	for(int i = 0; i < array.length; ++i) {
        		for(int j = 0; j < array[i].length; ++j) {
		                if(i > j && array[i][j] != 0) {
		                    return false;
		                }
		            }
		        }
		        return true;
		  }      
}