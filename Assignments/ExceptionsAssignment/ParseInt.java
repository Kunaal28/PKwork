package day8exceptionsagnmt;

import java.util.Scanner;

public class ParseInt {

	public static void main(String[] args) {
		int val,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		Scanner scanLine=new Scanner(scan.nextLine());
		try {
			while(scanLine.hasNext()) {
			val=Integer.parseInt(scanLine.next());
			sum=sum+val;
			}
		}
		catch (NumberFormatException e)
		{
			
		}
		finally {
			System.out.println("sum of integers of this line of text is "+sum);
		}
		scan.close();
	}
 

	}


