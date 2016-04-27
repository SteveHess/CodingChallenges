/*
 * Crack the Code Interview 1.1
 * Implement an algorithm to determine if a string has all unique characters. What
 * if you cannot use additional data structures?
 */

public class UniqueCharString {

	public static void main(String[] args) {

		String str = "am iunqe?";
		boolean result;
		
		result = checkForUniqueChars(str);
		
		System.out.println(result);
	}

	private static boolean checkForUniqueChars(String str) {
		char ch1, ch2;
		int k = 1;

		for (int i = 0; i < str.length(); i++) {
			ch1 = str.charAt(i);
			for (int j = k; j < str.length(); j++) {
				ch2 = str.charAt(j);
				if (ch1 == ch2) {
					return false;
				}
			}
			k++;
		}

		return true;
	}
}
