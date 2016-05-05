import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> ar = new ArrayList<Integer>();
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {            
            ar.add(scan.nextInt());
        }        
        
        int pivot = ar.get(0);
        
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < pivot) {
                left.add(ar.get(i));
            } else {
                right.add(ar.get(i));
            }
        }
        
        List<Integer> returnList = new ArrayList<Integer>(left);
        returnList.addAll(right);
        
        for (int i: returnList) {
            System.out.print(i + " ");
        }
    }
}
