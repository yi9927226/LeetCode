package LinkedListCyclePackage;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
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

    public static Set<ListNode> listNodeSet = new HashSet<ListNode>();

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        } else {
            if (listNodeSet.contains(head)) {
                return true;
            } else {
                listNodeSet.add(head);
                return hasCycle(head.next);
            }
        }
    }

}
