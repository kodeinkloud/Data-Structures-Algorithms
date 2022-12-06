// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next == null)
            return slow;

        return slow.next;

    }
}
