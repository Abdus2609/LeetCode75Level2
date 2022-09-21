public class P10LongestPalindromeConcatenation {
    
    public static int longestPalindrome(String[] words) {

        int result = 0;
        int[][] charChart = new int[26][26];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int firstChar = word.charAt(0) - 'a';
            int secondChar = word.charAt(1) - 'a';

            if (charChart[secondChar][firstChar] > 0) {
                result += 4;
                charChart[secondChar][firstChar]--;
            } else {
                charChart[firstChar][secondChar]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (charChart[i][i] > 0) {
                return result + 2;
            }
        }

        return result;
    }
}
