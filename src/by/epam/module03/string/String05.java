package by.epam.module03.string;

import java.util.Objects;

/*
Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
*/

public class String05 {

	public static void main(String[] args) {
		String searchValue = "a";
		String str = "Random string with random words.";

		printCountNumberOfMatches(str, searchValue);

		searchValue = "r";
		printCountNumberOfMatches(str, searchValue);

		searchValue = "2";
		printCountNumberOfMatches(str, searchValue);
	}

	private static int printCountNumberOfMatches(String str, String search) {
		int count;
		int index;

		String value = new String(str);

		value = value.toLowerCase();

		count = 0;

		if (Objects.isNull(str) || Objects.isNull(search)) {
			return count;
		}

		while (value.indexOf(search) != -1) {
			index = value.indexOf(search);
			index++;
			value = value.substring(index);
			count++;
		}

		System.out.println("In string:");
		System.out.println(str);
		System.out.println("value <<" + search + ">> occurs " + count + " times");
		System.out.println();

		return count;
	}
}
