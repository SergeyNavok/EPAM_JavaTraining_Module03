package by.epam.module03.array;

/*
Замените в строке все вхождения 'word' на 'letter'.
*/

public class Array02 {

	public static void main(String[] args) {
		final String DELIMETER = " ";

		String str = "Word, word, wwwOOOrd-word,word, wRod and another word, and 2words.";
		String result = new String();

		String[] wordsArray;
		wordsArray = str.split(DELIMETER);

		for (int i = 0; i < wordsArray.length; i++) {
			printReplaceWordWithLetter(wordsArray, i);

			result += wordsArray[i];

			if (i + 1 != wordsArray.length) {
				result += DELIMETER;
			}
		}

		System.out.println("String before change:");
		System.out.println(str);
		System.out.println();
		System.out.println("String after change:");
		System.out.println(result);
	}

	private static void printReplaceWordWithLetter(String[] wordsArray, int i) {
		int index;

		index = getIndexWord(wordsArray[i]);

		String letter = "letter";
		String result = new String();

		if (index == -1) {
			return;
		}

		result = wordsArray[i].substring(0, index);
		result += letter;
		result += wordsArray[i].substring(index + 4);

		wordsArray[i] = result;

		printReplaceWordWithLetter(wordsArray, i);
	}

	private static int getIndexWord(String str) {
		int index;
		int count;
		char[] symbols;

		index = -1;
		symbols = str.toCharArray();

		for (int i = 0; i < symbols.length - 3; i++) {
			count = 0;

			if ((symbols[i] == 'w') || (symbols[i] == 'W')) {
				count++;
			}

			if ((symbols[i + 1] == 'o') || (symbols[i + 1] == 'O')) {
				count++;
			}

			if ((symbols[i + 2] == 'r') || (symbols[i + 2] == 'R')) {
				count++;
			}

			if ((symbols[i + 3] == 'd') || (symbols[i + 3] == 'D')) {
				count++;
			}

			if (count == 4) {
				index = i;
				break;
			}
		}

		return index;
	}
}
