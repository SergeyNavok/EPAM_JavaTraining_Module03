package by.epam.module03.string;

/*
В строке вставить после каждого символа 'a' символ 'b'.
*/

public class String02 {

	public static void main(String[] args) {
		String searchValue = "a";
		String replaceValue = "ab";
		String str = "Random string with random words.";
		String result = new String();

		result = str.replaceAll(searchValue, replaceValue);

		System.out.println("Default string: ");
		System.out.println(str);
		System.out.println();
		System.out.println("Modified string: ");
		System.out.println(result);
	}
}
