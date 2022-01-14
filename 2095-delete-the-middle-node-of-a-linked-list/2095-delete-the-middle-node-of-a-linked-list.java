/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null)
            return head;
        else if(head.next == null)
            return null;
        else if(head.next.next == null)
        {
            head.next = null;
            return head;
        }
        else
        {
            ListNode fast = head;  //fast pointer
            ListNode slow = head;  //slow pointer
            ListNode flag = head;
            while(fast != null)
            {
                
                if(fast.next == null)
                    fast = fast.next;
                else if((fast.next).next == null)
                    fast = fast.next;
                else
                    fast = (fast.next).next;
                flag = slow;
                slow = slow.next;
            }
            fast = head;
            while(fast.next != flag)
                fast = fast.next;
            fast.next = flag.next;
            return head;
        }
    }
}