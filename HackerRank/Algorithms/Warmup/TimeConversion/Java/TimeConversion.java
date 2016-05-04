import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        int h = Integer.parseInt(t.substring(0,2));
        String x = t.substring(t.length() - 2);
        String minSec = t.substring(2, t.length() - 2);

        if (x.equals("AM") && h == 12) {
            t = "00" + minSec;
        } else if (x.equals("PM") && h < 12) {
            h += 12;
            t = h + minSec;
        } else if (h < 10) {
            t = "0" + h + minSec;
        } else {
            t = h + minSec;
        }

        System.out.println(t);
    }
}

