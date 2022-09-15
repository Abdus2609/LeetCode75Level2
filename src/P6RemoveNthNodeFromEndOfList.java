public class P6RemoveNthNodeFromEndOfList {
    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
         
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int pos = size - n + 1;
        if (pos == 1) {
            return head.next;
        }

        curr = head;
        int i = 0;
        while (curr != null) {
            i++;
            if (i + 1 == pos) {
                ListNode newNext = curr.next.next;
                curr.next = newNext;
            }

            curr = curr.next;
        }

        return head;
    }
}
