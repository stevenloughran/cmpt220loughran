// Steven Loughran
// Problem 18.13
// May 7, 2019

import java.util.*;

public class Problem18_13 {
    
	public static int getMaxVal(int arr[], int index) {
        if(index == arr.length-1){
            return arr[index];
        }
        else {
            int num = arr[index];
            int max = getMaxVal(arr, index + 1);
            if(num > max){
                return num;
            }
            else {
                return max;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[8];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 8 value: ");
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Largest element is: "+ getMaxVal(arr,0));
    }
}
	
	
	
	
	
	
