package com.problems.app.string;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class PalindromeTest {
	
	@Test
	public void testIsPalindromeIsTrue() {
		String[] palindromes = {"Race Car","Civic","level","radar","noon","taco cat", "Too bad I hid a boot"};

		for (String palindrome : palindromes) {
			boolean result = Palindrome.isPalindrome(palindrome);
			assertTrue(result);
		}
		
	}
	
	@Test
	public void testIsPalindromeIsFalse() {
		String[] notPalindromes = {"Forest","Not a Palindrome","Google","Java","coffee"};
		
		for (String notPalindrome : notPalindromes) {
			boolean result = Palindrome.isPalindrome(notPalindrome);
			assertFalse(result);
		}
	}

}
