package corejavaexamples;

import java.util.Arrays;

public class SumRecursive {
	
	static int arr[] = {1,2,3,4,5};
	
	static int sum() {
		
		int sum =0;
		
		
		for(int i = 0 ;i<arr.length;i++) {
			
			sum += arr[i];
				
		}
		return sum;
		
	}
	

	public static void main(String[] args) {

		System.out.println("sum of the array is " + sum());
	}

	}


