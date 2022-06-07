package by.epam.module03.string;

import java.util.Objects;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным 
или вопросительным знаком. Определить количество предложений в строке X.
*/

public class String10 {

	public static void main(String[] args) {
		String str = "One. Two? Three!";

		int numberOfSentences;

		numberOfSentences = getNumberOfSentences(str);

		System.out.println("String: <<" + str + ">> contains " + numberOfSentences + " sentences.");
	}

	private static int getNumberOfSentences(String str) {
		int index;
		int result;

		index = 0;
		result = 0;

		String symbol;
		String delimeter1 = ".";
		String delimeter2 = "!";
		String delimeter3 = "?";

		if (Objects.isNull(str)) {
			return result;
		}

		if (str.length() < 1) {
			return result;
		}

		while (index < str.length()) {
			symbol = str.substring(index, ++index);

			if (symbol.equals(delimeter1) || symbol.equals(delimeter2) || symbol.equals(delimeter3)) {
				result++;
			}
		}

		return result;
	}
}
