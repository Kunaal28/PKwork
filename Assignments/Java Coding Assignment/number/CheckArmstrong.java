package number;

import java.util.Scanner;

public class CheckArmstrong {

	public static boolean checkAmstrong(int x) {
		int number = x, sum = 0;
		int digits = (int) (Math.log10(x) + 1);
		while(x > 0) {
			int res = x % 10;
			sum += (Math.pow(res, digits));
			x /= 10;
		}
		return number == sum ? true : false;
	}
	
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    int number = x.nextInt();
	
	    boolean checkAmstrong = checkAmstrong(number);
        if (checkAmstrong) {
            System.out.println(number + " is a Amstrong number.");
        } else {
            System.out.println(number + " is not a Amstrong number.");
        }
        x.close();
	}

}
