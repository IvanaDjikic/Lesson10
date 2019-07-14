package exercises;

import java.util.List;

import examples.FileHelper;

public class Palindrome {

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}

	public boolean wordIsInDictionary(String word) {
		List dictionary = new Palindrome().loadWords();
		if (dictionary.contains(word)) {
			return true;
		} else {
			return false;
		}
	}

	public String reverseWord(String word) {
		char[] arrayOfChars = word.toCharArray();
		char[] reversedArray = new char[word.length()];
		for (int i = 0; i < arrayOfChars.length; i++) {
			reversedArray[word.length() - 1 - i] = arrayOfChars[i];

		}
		String reversedWord = new String(reversedArray);
		return reversedWord;
	}

	public boolean isPalindrome(String word) {
		if (new Palindrome().reverseWord(word).equals(word)) {
			return true;
		} else {
			return false;
		}

	}
}
