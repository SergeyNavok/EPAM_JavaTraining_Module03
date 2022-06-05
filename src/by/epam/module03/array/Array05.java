package by.epam.module03.array;

/*
Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы. 
Крайние пробелы в строке удалить.
*/

public class Array05 {

	final static char SPACE = ' ';

	public static void main(String[] args) {

		int firstSymbol;
		int lastSymbol;
		char[] symbols;

		String str = "  One, two,   three,      four.         ";
		String result = new String();

		symbols = str.toCharArray();
		firstSymbol = getFirstIndexOtherThanSpace(symbols);
		lastSymbol = getLastIndexOtherThanSpace(symbols);

		for (int i = firstSymbol; i <= lastSymbol; i++) {
			result += String.valueOf(symbols[i]);

			while (symbols[i] == SPACE) {
				i++;
			}
		}

		System.out.println("String default: <<" + str + ">>");
		System.out.println("Extra spaces removed: <<" + result + ">>");
	}

	private static int getFirstIndexOtherThanSpace(char[] symbols) {
		int index;

		index = -1;

		for (int i = 0; i < symbols.length; i++) {
			if (symbols[i] != SPACE) {
				index = i;

				return index;
			}
		}

		return index;
	}

	private static int getLastIndexOtherThanSpace(char[] symbols) {
		int index;
		int lastIndex;

		index = -1;
		lastIndex = symbols.length - 1;

		for (int i = lastIndex; i >= 0; i--) {
			if (symbols[i] != SPACE) {
				index = i;

				return index;
			}
		}

		return index;
	}
}
