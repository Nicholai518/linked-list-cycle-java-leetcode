public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode negativeFour = new ListNode(-4);
        ListNode zero = new ListNode(0);
        zero.next = negativeFour;
        ListNode two = new ListNode(2);
        two.next = zero;
        ListNode head = new ListNode(3);
        head.next = two;

        // wrap around to root
        negativeFour.next = head;

        System.out.println("Example One : " + solution.hasCycle(head));
    }
}
