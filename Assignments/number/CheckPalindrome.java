package number;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number to check if it is a palindrome:");
	        int x = scanner.nextInt();
	        int originalnumber = x;
	        int reversednumber = 0;

	        while (x > 0) {
	            int remainder = x % 10;
	            reversednumber = (reversednumber * 10) + remainder;
	            x /= 10;
	        }

	        if (originalnumber == reversednumber) {
	            System.out.println("It is a palindrome Number.");
	        } else {
	            System.out.println("It is not a palindrome Number.");
	        }
	}

}
