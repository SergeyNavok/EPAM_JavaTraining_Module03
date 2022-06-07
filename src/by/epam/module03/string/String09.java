package by.epam.module03.string;

import java.util.Scanner;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. 
Учитывать только английские буквы.
*/

public class String09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string:");

		StringBuilder str = new StringBuilder(sc.nextLine());

		int index;
		int countLowerCase;
		int countUpperCase;

		index = 0;
		countLowerCase = 0;
		countUpperCase = 0;

		char symbol;
		char firstLowerCase;
		char lastLowerCase;
		char firstUpperCase;
		char lastUpperCase;

		firstLowerCase = 'a';
		lastLowerCase = 'z';
		firstUpperCase = 'A';
		lastUpperCase = 'Z';

		while (index < str.length()) {
			symbol = str.charAt(index);

			if (symbol > firstLowerCase && symbol < lastLowerCase) {
				countLowerCase++;
			}

			if (symbol > firstUpperCase && symbol < lastUpperCase) {
				countUpperCase++;
			}

			index++;
		}

		System.out.println("String: <<" + str + ">> contains lowercase letter - " + countLowerCase
				+ ", and uppercase letter - " + countUpperCase);
	}
}
