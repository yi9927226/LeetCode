package LinkedListCyclePackage;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleByWhile {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> listNodeSet = new HashSet<ListNode>();
        while (head != null) {
            if (listNodeSet.contains(head)) {
                return true;
            }
            listNodeSet.add(head);
            head = head.next;
        }
        return false;
    }

}
