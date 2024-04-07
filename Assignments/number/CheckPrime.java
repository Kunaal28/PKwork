package number;

import java.util.Scanner;

public class CheckPrime {
	
	public static boolean isPrime(int number) {
//	    Because Negative numbers, 0, and 1 are not prime.
        if (number <= 1) {
            return false; 
        }
//  If divisible by any number other than 1 and itself, it's not prime.
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }

//	        Driver code
	        public static void main(String[] args) {
		
		    Scanner x = new Scanner(System.in);
		    System.out.println("Enter the number : ");
		    int number = x.nextInt();
		
		    boolean isPrime = isPrime(number);
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	        x.close();
	    }

	}


