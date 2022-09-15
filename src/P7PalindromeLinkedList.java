import java.util.*;

public class P7PalindromeLinkedList {
    
    public static boolean isPalindrome(ListNode head) {

        ListNode curr = head;
        List<Integer> list = new ArrayList<>();

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        List<Integer> firstHalf = list.subList(0, list.size() / 2);
        List<Integer> secondHalf = (list.size() % 2 == 0) ? list.subList(list.size() / 2, list.size()) : list.subList((list.size() / 2) + 1, list.size());

        Collections.reverse(secondHalf);

        return firstHalf.equals(secondHalf);
    }
}
