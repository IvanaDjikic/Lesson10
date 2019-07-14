package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("apple"));
	}

	// 2. Test that a word exists in the dictionary
	@Test
	void testWordIsInDictionary() {
		assertTrue(testPalindrome.wordIsInDictionary("aback"));
	}

	// 3. Test that a word is a palindrome
	@Test
	void testReverseWord() {
		// first way
		assertEquals("radar", testPalindrome.reverseWord("radar"));
		// second way
		assertTrue(testPalindrome.isPalindrome("wow"));
		assertFalse(testPalindrome.isPalindrome("green"));
	}

}
