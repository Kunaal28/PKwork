package exercise;

import java.util.Scanner;

public class OnlyDigitsAsgnmt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character: ");
		
		String str = sc.next().toLowerCase();
		
		int d = 0, a = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				a++;
			}
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				d++;
			}
		}
		
		if(d != 0 && a != 0) {
			System.out.println("It contains alphabets as well as digits");
		}
		else if(d != 0) {
			System.out.println("It contains only digits");
		}
		else if(a != 0) {
			System.out.println("It contains only alphabets");
		}
	}
		

	}



