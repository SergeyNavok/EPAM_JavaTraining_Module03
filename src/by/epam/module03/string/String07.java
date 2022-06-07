package by.epam.module03.string;

import java.util.Objects;
import java.util.Scanner;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/

public class String07 {

	public static void main(String[] args) {
		String str = getStringEnteredByUser();

		System.out.println("Entered string:");
		System.out.println(str);
		System.out.println();

		str = removeSpacesAndRepeatedCharacters(str);

		System.out.println("Edited string:");
		System.out.println(str);
	}

	private static String getStringEnteredByUser() {
		System.out.println("Enter the string: ");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String userInput = sc.nextLine();

		return userInput;
	}

	private static String removeSpacesAndRepeatedCharacters(String str) {
		if (Objects.isNull(str)) {
			return null;
		}

		int index;

		index = 0;

		String result = new String();
		String temp;
		String space = " ";
		String replace = "";

		while (index < str.length()) {
			temp = str.substring(index, index + 1);
			index++;

			if (result.contains(temp)) {
				continue;
			}

			result += temp;
		}

		result = result.replaceAll(space, replace);

		return result;
	}
}
