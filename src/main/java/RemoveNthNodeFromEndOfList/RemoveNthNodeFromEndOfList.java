package RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    int temp = 0;

    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head.next == null && n == 1) {
//            temp++;
//            return null;
//        }
        if (head.next != null) {
            head.next = removeNthFromEnd(head.next, n);
        }
        temp++;
        if (temp == n) {
            return head.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
