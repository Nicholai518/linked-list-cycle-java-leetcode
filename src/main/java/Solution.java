public class Solution {
    public boolean hasCycle(ListNode head) {
        // list is empty
        if (head == null) {
            return false;
        }
        // slow node / pointer
        ListNode slow = head;

        // fast node / pointer
        ListNode fast = head.next;

        while (slow != fast) {
            // we have reached the end of the list and never came back around
            // there is no cycle
            if (fast == null || fast.next == null) {
                return false;
            }
            // slow node moves one at a time
            slow = slow.next;

            // fast node moves two at a time
            fast = fast.next.next;
        }
        return true;
    }
}
