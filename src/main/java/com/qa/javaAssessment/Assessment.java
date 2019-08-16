package com.qa.javaAssessment;

import java.util.*;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		
		
		System.out.println(newApp.replace(input, "bert", ""));
		
		//make reverse method run on output of above
	}
		
		public String replace(String sentence, String before, String after) {
			String returnSentence = "";
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.substring(i, i+1).equals(before)) {
					returnSentence = returnSentence + after; 
				} else {
					returnSentence = returnSentence + sentence.substring(i, i+1);
				}
			}
			return returnSentence;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced() { // int a, int b, int c were the arguments contained in evenlySpaced
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int oneNum = input1.nextInt();
		System.out.println("Enter a number: ");
		int twoNum = input1.nextInt();
		System.out.println("Enter a number: ");
		int threeNum = input1.nextInt();
		
// I would have to order these numbers by the magnitude of their numerical value (in reverse), but can't remember the method for this
// e.g. int large = largest*(oneNum, twoNum, threeNum) and int small = smallest*(oneNum, twoNum, threeNum), medium would be leftover *(largest and smallest being methods themselves)
		
		
		int oneSum = (//medium - small)
		int twoSum = (//large - medium)
				
//	boolean evenlySpaced =
		
	if (oneSum == twoSum)
			return true;
		
		else
		
		return false;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String Mid(String input, int a) {
		
		// In this exercise I would find the length of the given string, and divide the length by two in order to approximate the index at the middle of the string
		// After acquiring this value I would store it as an integer variable
		// I would treat words with odd lengths differently while iterating later on
		// During for loops below, if value i (even) or e (odd) is ever equal to the integer variable mentioned, plus or minus int n, I would 'continue' rather than returning the value of i or e at that increment
		
		int lenInput = input.length();
		int startFin = lenInput % 2;
		
		String wordResult = "";
		
		if (startFin == 0) //iteration for even
			for (int i = 0; i< lenInput; i++)
				worldResult += input.substring(i, i+1)
		
		else if (startFin != 0) //iteration for odd - the integer variable used as an argument in the loop would begin with a value of 1 isntead of 0
			for (int e = 1; e< lenInput; e++)
				worldResult += input.substring(e, e+1);
		
		return worldResult;
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {		
			String word = "";
			char[] wordChar = word.toCharArray();
			
			for (char character: wordChar) 
				if (char * == character: wordChar)
				
					//*char 
		
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		
		String mayContainAm = "";
		String refAm - " am "
		
		char[] arrayRefAm = refAm.toCharArray();
		
		if //... conditionals to check if String contains 'am', followed by if 'am' is equal to arrayRefAm
		//loop counter which would increment the variable in the counting loop each time 'am' is equal to it,
		// return the value of loop variable
		
		return -1;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz() { // former argument was (int arg1)
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int checkNumber = input2.nextInt();
		
		if (checkNumber % 3 == 0)
			System.out.println("fizz");
		
		if (checkNumber % 5 == 0)
			System.out.println("buzz");
		
		if (checkNumber% 3 == 0  && checkNumber % 5 == 0)
			System.out.println("fizzbuzz");
		
		return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		
		
		return -1;
	}
}
