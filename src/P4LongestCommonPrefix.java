import java.util.Arrays;

public class P4LongestCommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        String refWord = strs[0];

        for (int i = 0; i < refWord.length(); i++) {
            char c = refWord.charAt(i);
            final int pos = i;

            long numCommon = Arrays.stream(strs).filter(w -> w.length() > pos && w.charAt(pos) == c).count();
            if (numCommon == strs.length) {
                sb.append(Character.toString(c));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
