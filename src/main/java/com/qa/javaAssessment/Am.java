package com.qa.javaAssessment;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Am {
	
	public static void main(String[] args) {
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter a jumbled string featuring 'am', its occurrence will be tracked whenever 'am' appears without "
				+ "being followed or proceeded by other letters:");
		
		String inputString = input2.nextLine();
		String subString = "am";
		String regEx = "\\b" + subString.toLowerCase() + "\\b";
		
		int count = 0; // This holds the word count
		
		// Compile the regular expression
		Pattern yo = Pattern.compile(regEx);
		
		// Checks for matches of substring within user string, utilising compiled pattern above
		
		Matcher hi = yo.matcher(inputString.toLowerCase());
		
		// Count the number of matches
		while (hi.find()) {
			count++;
		}
		
		// Print result of count
		System.out.println(count);
	}

}
