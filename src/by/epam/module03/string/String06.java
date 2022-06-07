package by.epam.module03.string;

/*
Из заданной строки получить новую, повторив каждый символ дважды.
*/

public class String06 {

	public static void main(String[] args) {
		int index;

		index = 0;

		String str = "Random string with random words.";
		String result = new String();
		String temp;

		while (index < str.length()) {
			temp = str.substring(index, index + 1);
			result += temp;
			result += temp;
			index++;
		}

		System.out.println(str);
		System.out.println(result);
	}
}
