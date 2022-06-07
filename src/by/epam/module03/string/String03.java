package by.epam.module03.string;

/*
Проверить, является ли заданное слово палиндромом.
*/

public class String03 {

	public static void main(String[] args) {
		String word = "level";
		isPalindrome(word);

		word = "Anna";
		isPalindrome(word);

		word = "Word";
		isPalindrome(word);
	}

	private static boolean isPalindrome(String value) {
		boolean result;
		StringBuilder str;

		str = new StringBuilder(value);
		str = str.reverse();

		result = str.toString().equalsIgnoreCase(value);

		if (result) {
			System.out.println("<<" + value + ">> is a palindrome.");
		} else {
			System.out.println("<<" + value + ">> is not a palindrome.");
		}

		return result;
	}
}
