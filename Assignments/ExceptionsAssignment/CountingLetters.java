package day8exceptionsagnmt;

import java.util.Scanner;

public class CountingLetters {

	public static void main(String[] args) {
		
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a single word(letters only)");
		String word = scan.nextLine();
		
		word = word.toLowerCase();
		int index=0;
		try {
		for(int i=0;i<word.length();i++) {
			index = word.charAt(i);
			counts[index-'a']++;
		}
		}catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println((char)index + " is not a letter");
			
		}
		for(int i=0;i<counts.length;i++) {
			if(counts[i]!=0) {
				System.out.println((char)(i+'a')+":"+counts[i]);
			}
		}
		
		
		
		
		

	}

}
