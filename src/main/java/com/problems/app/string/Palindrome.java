package com.problems.app.string;

/**
 * Palindrome
 * @author Forest Newark
 *
 */
public class Palindrome {
	
	/**
	 * isPalindrome
	 * @param input
	 * @return
	 */
	public static boolean isPalindrome(String input) {
		// Initialize Response
		boolean isPalindrome = true;
		
		// Lower case the string
		input = input.toLowerCase();
		
		// Remove Spaces
		input = input.replaceAll("\\s+" , "");
		
		// Get Length of String
		int length = input.length();
		
		// Get middle of String
		int middle = length/2; 
		
		// Loop from start of string until middle of string
		for (int i = 0; i < middle ; i++) {
			
			// If characters are not a match, set response to false. 
			if(input.charAt(i) != input.charAt(length -1 - i)) {
				isPalindrome = false; 
			}
		}		
		
		// Return isPalindrome
		return isPalindrome; 
		
	}

}
