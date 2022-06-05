package by.epam.module03.array;

/*
В строке найти количество цифр.
*/

public class Array03 {

	public static void main(String[] args) {
		int count;
		char[] symbols;

		String str = "1 a2 b34 c-56 d7 -8";

		count = 0;
		symbols = str.toCharArray();

		for (char letter : symbols) {
			if (letter >= '0' && letter <= '9') {
				count++;
			}
		}

		System.out.println(count + " digits per line.");
	}
}
