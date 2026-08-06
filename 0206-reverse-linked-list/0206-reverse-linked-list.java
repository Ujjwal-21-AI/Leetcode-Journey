class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }
        
        // Recursive step
        ListNode newHead = reverseList(head.next);
        
        // Reverse current node's link
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
}