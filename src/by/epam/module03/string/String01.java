package by.epam.module03.string;

/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
*/

public class String01 {

	public static void main(String[] args) {
		String symbol;
		String space = " ";
		String str = "  One, two,   three,      four.         ";

		int count;
		int index;
		int result;

		count = 0;
		index = 0;
		result = 0;

		while (index < str.length()) {
			symbol = str.substring(index, ++index);

			if (symbol.equals(space)) {
				count++;
			} else {
				result = result < count ? count : result;
				count = 0;
			}
		}

		System.out.println("Most consecutive spaces - " + count);
	}
}
