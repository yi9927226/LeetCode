package MergeTwoSortedListsPackage;

public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        showListNode(mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode l = root;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l.next = l2;
                break;
            } else if (l2 == null) {
                l.next = l1;
                break;
            } else {
                if (l1.val < l2.val) {
                    l.next = l1;
                    l1 = l1.next;
                } else {
                    l.next = l2;
                    l2 = l2.next;
                }
                l = l.next;
            }
        }

        return root.next;
    }

    public static void showListNode(ListNode l) {
        if (l != null) {
            System.out.print(l.val);
            l = l.next;
        }
        while (l != null) {
            System.out.print(" -> " + l.val);
            l = l.next;
        }
    }
}
