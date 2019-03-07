package RemoveNthNodeFromEndOfList;

import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void removeNthFromEnd() {
        RemoveNthNodeFromEndOfList.ListNode listNode = new RemoveNthNodeFromEndOfList.ListNode(1);
        System.out.println(new RemoveNthNodeFromEndOfList().removeNthFromEnd(listNode, 1));
    }

    @Test
    public void removeNthFromEnd001() {
        RemoveNthNodeFromEndOfList.ListNode listNode = new RemoveNthNodeFromEndOfList.ListNode(1);
        listNode.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        System.out.println(new RemoveNthNodeFromEndOfList().removeNthFromEnd(listNode, 1).val);
    }
}