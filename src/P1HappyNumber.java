import java.util.*;

public class P1HappyNumber {

    public static boolean isHappy(int n) {
        
        Set<Integer> seen = new HashSet<>();
        
        while (!seen.contains(n)) {
            seen.add(n);

            int sumOfSquareDigits = 0;
            while (n > 0) {
                sumOfSquareDigits += (n % 10) * (n % 10);
                n /= 10;
            }

            n = sumOfSquareDigits;

            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}