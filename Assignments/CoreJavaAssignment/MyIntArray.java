package corejavaexamples;

import java.util.Arrays;
import java.util.Random;

public class MyIntArray {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		Random random = new Random();
		for(int i=0;i<10;i++) {
			 array[i] = random.nextInt(100) + 1;

		}
		
		System.out.println("Unsorted int values"+Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("sorted int values"+Arrays.toString(array));
		

	}

	
}
