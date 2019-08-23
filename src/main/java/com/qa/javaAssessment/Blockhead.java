package com.qa.javaAssessment;

import java.util.*;

public class Blockhead {

	public static void main(String[] args) {

		Scanner blockScan = new Scanner(System.in);
		System.out.println("Input a string ft. lots of duplicate characters: ");
		String xoCube = blockScan.nextLine();
		
		System.out.println("Repeating characters in the largest block: " + bigBlock(xoCube));

	}
	
	static int bigBlock(String str) {
		
		int len = str.length();
		int count = 0;
		
		// Finds the maximum repeating character
		// starting from str[i]
		
		// char res = str.charAt(0);
		
		for (int i=0; i<len; i++) {
			int currentc = 1;
			for (int j=i+1; j<len; j++) {
				if (str.charAt(i) != str.charAt(j))
					break;
				currentc++;
			}
			
			if (currentc > count) {
				count = currentc;
				
				// res = str.charAt(i;)
			}
		}
		
		return count;
	}

}
