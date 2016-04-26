import java.util.ArrayList;
import java.util.Scanner;
 
class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner theScanner = new Scanner(System.in);
        System.out.println("How many test cases? ");
        int T = theScanner.nextInt();
        
        for (int i = 0; i < T; i++) {
        	System.out.println("How many friends for test case " + (i+1) + "?");
        	int N = theScanner.nextInt();
        	
        	System.out.println("How much money for test case " + (i+1) + "?");
        	int X = theScanner.nextInt();  
        	
        	String returnValue = gifts(N, X, theScanner);
        	System.out.println(returnValue);
        }  
    }
	
	public static String gifts(int N, int X, Scanner theScanner) {
		int nextCost;
		int costSum = 0;
		int indexPos = 0;
		ArrayList<Integer> costArray = new ArrayList<Integer>();		
		
		for (int i = 0; i < N; i++) {
			System.out.println("How much money does gift " + (i+1) + " cost?");
        	nextCost = theScanner.nextInt();
        	costArray.add(nextCost);
        }
    	
		for (int i = 0; i < N; i++) {
			while (costSum > X) {
				costSum -= costArray.get(indexPos);
				indexPos++;
			}
			
			if (costSum == X) {
				return "YES";
			}
			
			costSum += costArray.get(i);
		}
		
		while (costSum > X) {
			costSum -= costArray.get(indexPos);
			indexPos++;
		}
		
		if (costSum == X) {
			return "YES";
		}
		
		return "NO";
	}
}