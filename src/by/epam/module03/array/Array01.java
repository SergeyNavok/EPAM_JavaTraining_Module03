package by.epam.module03.array;

import java.util.Arrays;

/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
*/

public class Array01 {

	public static void main(String[] args) {
		char symbol;
		char[] charsArray;
		String value1;
		String value2;
		String value3;
		String[] strArray;

		strArray = new String[] { "camelCase", "snakeCase", "StrING", "error_1", "error2", "Error3", "2" };

		System.out.println("camelCase string - " + Arrays.toString(strArray));

		for (int i = 0; i < strArray.length; i++) {
			charsArray = strArray[i].toCharArray();

			for (int j = 0; j < charsArray.length; j++) {
				symbol = charsArray[j];

				if (symbol > 'A' && symbol < 'Z') {
					value1 = strArray[i].substring(0, j);
					value2 = String.valueOf(symbol).toLowerCase();
					value3 = strArray[i].substring(j + 1);

					symbol = '_';

					strArray[i] = value1 + symbol + value2 + value3;

					charsArray = strArray[i].toCharArray();
				}
			}
		}

		System.out.println("snake_case string - " + Arrays.toString(strArray));
	}
}
