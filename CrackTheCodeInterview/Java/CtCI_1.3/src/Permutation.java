import java.util.Scanner;

/*
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

public class Permutation {
	public static void main(String args[]) {
		System.out.println("Enter first string: ");
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		System.out.println("Enter second string: ");
		String second = sc.next();
		boolean result;		
		
		if (first.length() == second.length()) {
			//only check for permutation if both strings contain the same amount of characters
			result = isPermutation(first, second);
		} else {
			result = false;
		}
		
		System.out.println(result);
	}

	private static boolean isPermutation(String first, String second) {
		char a, b;
		String front, back;
		boolean found;
		for (int i = 0; i < first.length(); i++) {
			a = first.charAt(i);
			found = false;
			for (int j = 0; j < second.length(); j++) {
				b = second.charAt(j);				
				if (a == b) {
					front = second.substring(0, j);
					back = second.substring(j+1, second.length());
					second = front + back;
					found = true;
					break;
				}				
			}
			if (!found) {
				return false;
			}
		}		
		 
		return true;		
	}
}
