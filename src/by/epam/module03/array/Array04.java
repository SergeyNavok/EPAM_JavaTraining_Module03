package by.epam.module03.array;

/*
В строке найти количество чисел.
*/

public class Array04 {

	public static void main(String[] args) {
		int count;
		char[] symbols;

		String str = "1, 2.2; 3,3; 44, 55-6.0; 7";

		count = 0;
		symbols = str.toCharArray();

		for (int i = 0; i < symbols.length; i++) {

			if (isNumeral(symbols[i])) {

				while (isNumeral(symbols[i]) || isNumberSepator(symbols[i])) {
					i++;

					if (i == symbols.length) {
						break;
					}
				}

				count++;
			}
		}

		System.out.println("There are " + count + " numbers in a line.");
	}

	private static boolean isNumeral(char value) {
		if (value >= '0' && value <= '9') {
			return true;
		}

		return false;
	}

	private static boolean isNumberSepator(char value) {
		if (value == '.' || value == ',') {
			return true;
		}

		return false;
	}
}
