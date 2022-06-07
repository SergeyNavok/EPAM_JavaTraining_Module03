package by.epam.module03.string;

import java.util.Objects;
import java.util.Scanner;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых 
длинных слов может быть несколько, не обрабатывать.
*/

public class String08 {

	public static void main(String[] args) {
		String str = getStringEnteredByUser();

		System.out.println("Entered string: ");
		System.out.println(str);
		System.out.println();
		System.out.println("Longest word in a string: ");

		printLongestWord(str);
	}

	private static String getStringEnteredByUser() {
		System.out.println("Enter the string: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String userInput = sc.nextLine();

		return userInput;
	}

	private static void printLongestWord(String str) {
		if (Objects.isNull(str)) {
			return;
		}

		int index;

		index = 0;

		String space = " ";
		String[] words = str.split(space);

		for (int i = 0; i < words.length; i++) {
			if (words[index].length() < words[i].length()) {
				index = i;
			}
		}

		System.out.println(words[index]);
	}
}
