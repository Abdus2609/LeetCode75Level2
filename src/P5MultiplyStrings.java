import java.util.ArrayList;
import java.util.*;

public class P5MultiplyStrings {
    
    public static String multiply(String num1, String num2) {
        
        String n1 = new StringBuilder(num1).reverse().toString();
        String n2 = new StringBuilder(num2).reverse().toString();

        int[] toSum = new int[n1.length() + n2.length()];

        for (int i = 0; i < n1.length(); i++) {
            for (int j = 0; j < n2.length(); j++) {
                toSum[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < toSum.length; i++) {
            if (i + 1 < toSum.length) {
                toSum[i + 1] += toSum[i] / 10;
            }

            sb.insert(0, toSum[i] % 10);
        }
     
        while(sb.charAt(0) == '0' && sb.length() > 1){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("12243", "12"));
    }
}
