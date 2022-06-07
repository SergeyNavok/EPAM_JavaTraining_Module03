package by.epam.module03.string;

/*
С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
*/

public class String04 {

	public static void main(String[] args) {
		String str = "informatika"; // У меня здесь были проблемы с отображением русских символов на разных
									// кодировках, поэтому использовал транскрипцию.
		String result = new String();

		result = str.substring(7, 8);
		result += str.substring(3, 4);
		result += str.substring(4, 5);
		result += str.substring(7, 8);

		System.out.println(str);
		System.out.println(result);
	}
}
