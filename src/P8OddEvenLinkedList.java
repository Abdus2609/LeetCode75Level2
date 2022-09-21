public class P8OddEvenLinkedList {
    
    public static ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode result = head;
        ListNode curr = head;
        ListNode next = head.next;
        ListNode firstEven = head.next;

        while (curr != null && next != null) {

            ListNode temp = next.next;
            if (temp == null) {
                break;
            }

            curr.next = temp;
            next.next = temp.next;

            curr = curr.next;
            next = next.next;
        }
        
        curr.next = firstEven;

        return result;
    }
}
