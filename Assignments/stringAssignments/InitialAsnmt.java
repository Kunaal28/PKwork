package day5stringbuffer;

import java.util.Scanner;

public class InitialAsnmt {

	public static void main(String[] args) {
		Scanner Fullname = new Scanner(System.in);
		System.out.println("Enter your FullName: ");
		
		String FName = Fullname.nextLine();
		
		String result = FName.substring(0,1)+' ';
		
		for(int i=0;i<FName.length();i++) {
			
			if(FName.charAt(i)==' ') {
				result = result.concat(FName.substring(i+1,i+2));
			}
		}
		System.out.println(result);
		

	}

	
}
