package com.qa.javaAssessment;

import java.util.*;

public class SplitString {

	public static void main(String[] args) {
		Scanner insideOut = new Scanner(System.in);
		System.out.println("Input digits for string, no spaces allowed: ");
		String xoCube = insideOut.nextLine();
		
		int[] nums = new int[xoCube.length()];
		for(int i = 0; i < xoCube.length(); i++) {
			nums[i] = Integer.parseInt(""+xoCube.charAt(i));
		}
		
		int sum = 0;
		for (int i : nums)
			sum += i;
		System.out.println(sum);

	}

}
