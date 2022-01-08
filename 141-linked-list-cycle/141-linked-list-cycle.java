/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        if(head.next == null)
            return false;
        if(head.next.next == null)
            return false;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(fast!=null || slow!=null)
        {
            if(fast == slow)
                return true;
            slow = slow.next;
            if(fast.next == null || fast.next.next == null)
                return false;
            fast = fast.next.next;
        }
        return false;
    }
}