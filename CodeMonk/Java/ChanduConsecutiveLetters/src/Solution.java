import java.util.Scanner;

class Solution {
    public static void main(String args[] ) throws Exception {      
    	
    	System.out.println("Enter the number of test cases: ");        
        Scanner theScanner = new Scanner(System.in);
        int totalTests = theScanner.nextInt();
        
        for (int i = 0; i < totalTests; i++) {
        	System.out.println("Enter a string for test case " + (i+1) + ":");
        	String thisTestCase = theScanner.next();
        	thisTestCase += " ";
        	String returnValue = "";
        	char ch1, ch2;
        	
        	for (int j = 0; j < thisTestCase.length()-1; j++) {
        		ch1 = thisTestCase.charAt(j);
        		ch2 = thisTestCase.charAt(j+1);
        		
        		if (ch1 != ch2) {
        			returnValue += ch1;
        		}
        	}
        	
        	System.out.println(returnValue);
        }
        theScanner.close();
    }
}